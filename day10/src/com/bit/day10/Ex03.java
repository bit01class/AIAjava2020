package com.bit.day10;

abstract class Machine01{
	void on() {
		System.out.println("����on");
	}
	void off() {
		System.out.println("����off");
	}
	abstract void work();
}
class Audio extends Machine01{

	@Override // ������̼�
	void work() {
		
	}
	
}

class Tv01 extends Machine01{
	void work() {
		System.out.println("ȭ���� �����Ѵ�");
	}
}
class Radio01 extends Machine01{
	void work() {
		System.out.println("�Ҹ��� �����Ѵ�");
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
