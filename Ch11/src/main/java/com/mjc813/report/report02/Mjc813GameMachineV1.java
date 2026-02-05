package com.mjc813.report.report02;

public class Mjc813GameMachineV1 {
	private int battery = 0;
	//private MarioGame game1;
	private MarioGame game1 = new MarioGame();

	public Mjc813GameMachineV1(){}

	public Mjc813GameMachineV1(int battery , MarioGame game1){
		this.battery = battery;
		this.game1 = game1;
	}

	public void runGame1() throws BatteryLessThan5Exception,Game1IsNullException {
		if ( battery < 5 ) {
			throw new BatteryLessThan5Exception("배터리 5% 미만 입니다: "+battery);
			// 배터리 5% 미만 이라는 예외를 만들어서 던져보세요
			// 예외클래스 이름은 BatteryLessThan5Exception

		}
		if ( this.game1 == null ) {
			// game1 소프트웨어가 없다 라는 예외를 만들어서 던져 보세요
			throw new Game1IsNullException("소프트웨어가 없습니다");
		}
		this.game1.runGame1();
	}
}
