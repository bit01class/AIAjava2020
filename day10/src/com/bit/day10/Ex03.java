package com.bit.day10;

abstract class Machine01{
	void on() {
		System.out.println("전원on");
	}
	void off() {
		System.out.println("전원off");
	}
	abstract void work();
}
class Audio extends Machine01{

	@Override // 어노테이션
	void work() {
		
	}
	
}

class Tv01 extends Machine01{
	void work() {
		System.out.println("화면을 전송한다");
	}
}
class Radio01 extends Machine01{
	void work() {
		System.out.println("소리를 전송한다");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Machine01 machine=new Tv01();
		machine.on();
		machine.work();
		machine.off();

	}

}
