package com.mjc813.petap;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PetResponseDto { //데이터만 주는게 아니라 실패/성공 여부와 안내 메세지까지 한세트로 보여주는 에러낫을때 예방느낌?
	private Integer code;
	private String message;
	private Object data;
}
