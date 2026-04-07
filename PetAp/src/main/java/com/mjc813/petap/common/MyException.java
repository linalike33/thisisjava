package com.mjc813.petap.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MyException extends Exception {
	private Object data;
}
