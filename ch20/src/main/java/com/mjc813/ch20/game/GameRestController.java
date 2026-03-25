package com.mjc813.ch20.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameRestController {
	@Autowired
	private GameService gameService;

	@PostMapping("/api/insert-data")
	public ResponseEntity<CommonResponse> insertData(@RequestBody GameDto gameDto) { //void는 "일 다 했으니 끝(무소식)"이고 따라서 실패를 했는지 성공을 햇는지 알 수가 없음\      ResponseEntity는 "일 다 했고 결과는 이래(공식 보고서)"입니다.
		try {
			System.out.println("insertData" + gameDto.toString());
			this.gameService.insertData(gameDto);
			return ResponseEntity.ok().body(new CommonResponse(0, "OK"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new CommonResponse(-999, "Server Error"));
		}
	}
	@PatchMapping("/api/update-data")
	public ResponseEntity<CommonResponse> updateData(@RequestBody GameDto gameDto) {
		try {
			System.out.println("insertData" + gameDto.toString());
			this.gameService.updateData(gameDto);
			return ResponseEntity.ok().body(new CommonResponse(0, "OK"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new CommonResponse(-999, "Server Error"));
		}
	}
}