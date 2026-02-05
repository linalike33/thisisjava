package com.mjc813.report.report01;

public class Mjc813Calculator {
	public Long sum(Integer... arrs) throws NullPointerException{
		Long result = 0L;
		// arrs 값들의 모든 합을 구해야 합니다.
		// 다만 arrs 배열이 null 일 수 있으므로 예외처리를 이곳이든 이곳을 호출하는 메소드에서든 꼭 해야 합니다.
		if (arrs == null) {
			throw new NullPointerException("arrs is null");
		}
		for (int i = 0; i < arrs.length; i++) {
			//if (arrs[i] != null) {
				result += arrs[i];
			//}
		}
		return result;
	}

	public Long sum(Integer[] arrs, Integer start, Integer end) throws NullPointerException, ArrayIndexOutOfBoundsException {
		if (arrs == null) {
			throw new NullPointerException("arrs is null");
		}
		Long result = 0L;
		// arrs 배열중에서 start ~ end 인덱스 까지의 원소들의 모든 합을 구해야 합니다.
		// 다만 arrs 배열이 null 일 수 도 있고, 원소가 null 일 수도 있고
		// 배열 인덱스 start ~ end 가 문제가 생길 수 도 있습니다.
		// 그러므로 예외처리를 꼭 해야 합니다.

//		if (arrs == null || start < 0 || end >= arrs.length ||start>end) {
//			return 0L;
//		}
		for (int i = start; i <= end; i++) {
//			if (arrs[i] != null) {
				result += arrs[i];
//			}
		}
		return result;
	}
}
