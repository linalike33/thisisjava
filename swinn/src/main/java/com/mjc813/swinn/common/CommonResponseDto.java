package com.mjc813.swinn.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommonResponseDto<T> {
	private CommonResponseCode code;
	private String message;
	private T result;

	public static <T> CommonResponseDto<T> make(CommonResponseCode code, T data) {
		return new CommonResponseDto<T>(code, code.getMessage(), data);
	}
}
