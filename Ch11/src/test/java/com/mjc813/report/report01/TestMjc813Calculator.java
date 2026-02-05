package com.mjc813.report.report01;

import com.mjc813.report.report01.Mjc813Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMjc813Calculator {
	@Test
	public void testSum() {
		Mjc813Calculator mjc813cal = new Mjc813Calculator();
		NullPointerException exception1 = assertThrows(NullPointerException.class, () -> {
			mjc813cal.sum(null);
		});
		NullPointerException exception2 = assertThrows(NullPointerException.class, () -> {
			mjc813cal.sum(3, null, 1);
		});
		//assertThat(mjc813cal.sum(3, null, 1)).isEqualTo(4);  에러없이 정상적으로 값이 나와야한다는 뜻이고
		//이 코드는 "계산 결과가 4가 나와야 해"라고 기대하는 코드입니다.
		//하지만 sum 메서드를 실행하는 도중에 null 값을 만나서 NullPointerException이 터져버립니다.
		//결과값(4)을 확인하기도 전에 프로그램이 에러로 멈춰버리기 때문에 테스트가 실패(Error)하게 되는 것입니다.
		//내가 작성한 코드가 원하는 목적이 다르기 때문에 내가 작성한 코드는 null 을 사용한 코드를 작송해야하기때눙ㅇ

       //assertThat(mjc813cal.sum(null, 0, 1)).isEqualTo(0);
		NullPointerException exception3 = assertThrows(NullPointerException.class, () -> {
			mjc813cal.sum(null, 0, 1);  //이거와는 또 다른 뜻이기에 하나만이 출력될 수 잇다 이건 반드시 null을 발생하라는 뜻이기에
		});
		NullPointerException exception4 = assertThrows(NullPointerException.class, () -> {
			mjc813cal.sum(new Integer[] {3, null, 1}, 0, 1);
		});
		NullPointerException exception5 = assertThrows(NullPointerException.class, () -> {
			mjc813cal.sum(new Integer[] {3, 6, 7, 9, 11, 13}, null, 1);
		});
		NullPointerException exception6 = assertThrows(NullPointerException.class, () -> {
			mjc813cal.sum(new Integer[] {3, 6, 7, 9, 11, 13}, 1, null);
		});
		ArrayIndexOutOfBoundsException exception7 = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			mjc813cal.sum(new Integer[] {3, 6, 7, 9, 11, 13}, -1, 3);
		});
		ArrayIndexOutOfBoundsException exception8 = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			mjc813cal.sum(new Integer[] {3, 6, 7, 9, 11, 13}, 4, 6);
		});

		assertThat(mjc813cal.sum(1, 2, 3, 4, 5)).isEqualTo(15);
		assertThat(mjc813cal.sum(new Integer[] {3, 6, 7, 9, 11, 13}, 2, 4)).isEqualTo(27);
	}
}
