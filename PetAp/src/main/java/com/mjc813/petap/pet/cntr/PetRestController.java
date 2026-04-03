package com.mjc813.petap.pet.cntr;

import com.mjc813.petap.PetRequestDto;
import com.mjc813.petap.PetResponseDto;
import com.mjc813.petap.pet.dto.petDto;
import com.mjc813.petap.pet.dto.petEntity;
import com.mjc813.petap.pet.svc.petService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

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

	@DeleteMapping //데이터 삭제
	public ResponseEntity<PetResponseDto> deletePet(@RequestParam Integer id) { //주소창에 "?id=1" 처럼 '물음표' 달고 오는 오는 걸 잡는다
		try {
			petDto result = this.petService.deleteById(id);
			return ResponseEntity.ok().body(new PetResponseDto(0, "SUCCESS", result));
		} catch (NoSuchElementException e) { //만약삭제하려는데 그 번호가 엇다면
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new PetResponseDto(-997, "Not found error", null));
		} catch (Exception e) { //알수업는 사고는
			return ResponseEntity.status(500).body(new PetResponseDto(-999, "ERROR", null));
		}
	}

	@GetMapping("/{id}") //조회   // => /api/pet?id=번호  => /api/pet/번호
	public ResponseEntity<PetResponseDto> findById(@PathVariable Object id) { //@PathVariable: 주소 경로에 포함된 값을 쏙 빼서 id 변수에 담는다
		try {
			Integer nId = Integer.parseInt(id.toString());
			petDto result = this.petService.findById(nId);
			return ResponseEntity.ok().body(new PetResponseDto(0, "SUCCESS", result));
		} catch (NoSuchElementException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new PetResponseDto(-997, "Not found error", null));
		} catch (NumberFormatException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new PetResponseDto(-994, "Number error", null));
		} catch (Exception e) {
			return ResponseEntity.status(500).body(new PetResponseDto(-999, "ERROR", null));
		}
	}
	@GetMapping("/search")//이름으로 검색하기
	public ResponseEntity<PetResponseDto> findByNameContains(
			@RequestParam (name="searchName", defaultValue = "")  String searchName //(name="searchName", defaultValue = "")   이걸 추가 하지 않았을때는 검색창에 아무것도 쓰지 않고 검색 버튼을 누리면 에러가 발생하는데 저 코드를 추가하면 아무것도 안쓴걸로 생각하고 빈 칸으로 처리해주며 전체 목록을 보여주게된다
			, @PageableDefault(size=5, sort="id", direction = Sort.Direction.DESC) Pageable pageable)
	// 웹클라이언트에서 GET주소 요청시에 Pageable 정보를 이런식으로 전달할 수 있다. &sort=id,desc&size=4&page=0
			//몇 페이지 보여줘라고 하지 않아도 기본으로 5개씩 iD 큰 순서대로 잘라서 보여준다
	{
		try {
			PetRequestDto prd = new PetRequestDto(); //검색어가 담길 PetRequestDto 생성
			prd.setSearchName(searchName);
			//petService 서버를 호출 이름 이 포함된 페이지 규격에 맞게 가져오는것
			//Slice 전체 개수를 세는게 아니고 다음 페이지가 잇다 없나 체크하는 목록
			Slice<petEntity> result = this.petService.findByNameContains(prd, pageable);
			return ResponseEntity.ok().body(new PetResponseDto(0, "SUCCESS", result));
		} catch (Exception e) {
			return ResponseEntity.status(500).body(new PetResponseDto(-999, "ERROR", null));
		}
	}
}


