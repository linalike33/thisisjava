package com.mjc813.petap.pet.cntr;

import com.mjc813.petap.PetResponseDto;
import com.mjc813.petap.pet.dto.petDto;
import com.mjc813.petap.pet.svc.petService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //화면을 안보여주고 무조건 데이터만 응답하겠다고 선언
@RequestMapping("/api/pet") //주소를 정하는 것 서버에 들어왔을 때 이 클래스가 담당한다
public class PetRestController { //화면없이 json 같은 데이터만 주고 받는 창고
	@Autowired
	public petService petService;

	@PostMapping //데이터를 새로 저장 하러온 사람만 받으라는 뜻
	public ResponseEntity<PetResponseDto> insertPet(@RequestBody petDto petDtoo) { //손님이 보낸 JSON 덩어리를 자바 상자인 petDto로 자동으로 변환해서 담아줍니다.
		try {
			petDto result = this.petService.insert(petDtoo);
			return ResponseEntity.ok().body(new PetResponseDto(0, "SUCCESS", result));
		} catch (Exception ex) {
			return ResponseEntity.status(500).body(new PetResponseDto(-999, "ERROR", null));
			//PetResponseDto여기로 다서 에러를 보낸다는 것 500
		}
	}
	@PatchMapping //PATCH(일부 수정) 방식으로 들어온 데이터를 받겠다라는 뜻
	public ResponseEntity<PetResponseDto> update(@RequestBody petDto petDtoo){ //손님이 보낸 JSON 덩어리를 자바 상자인 petDto로 자동으로 변환해서 담아줍니다.
		try {
			petDto result = this.petService.update(petDtoo); //petService 이걸 호출에 petDtoo 이게 데이터를 주고 그 데이터를 DB에 가서  수정하라는 뜻
			return ResponseEntity.ok().body(new PetResponseDto(0, "SUCCESS", result)); //성공 200 사인과 함께
		}catch (Exception e){
			return ResponseEntity.status(500).body(new PetResponseDto(-999, "ERROR", null)); //오류
			//PetResponseDto여기로 다서 에러를 보낸다는 것 500
		}
	} //롬복 설명 @PostMapping-> 데이터 신규 등록(아예 없는 데이터를 새로 만들때 사용한다) @PatchMapping -> 데이터 일부 수정(이미 있는 데이터 중 하나만 바꿀때 사용)
}
