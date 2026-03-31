package com.mjc813.petap.pet.cntr;

import com.mjc813.petap.PetResponseDto;
import com.mjc813.petap.pet.dto.petDto;
import com.mjc813.petap.pet.svc.petService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
