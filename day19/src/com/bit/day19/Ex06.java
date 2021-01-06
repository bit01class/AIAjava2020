package com.bit.day19;

abstract class Machine01{
	void on() {System.out.println("�Ѵ�");}
	void off() {System.out.println("����");}
	abstract void work();
}
class Tv01 extends Machine01{
	void work() {
		System.out.println("����� �����ִ�");
	}
}
class Radio01 extends Machine01{
	void work() {
		System.out.println("����� ����ش�");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		int input=2;
		Machine01 machine=null;
		if(input==1) {
			machine=new Tv01();
		}else if(input==2) {
			machine=new Radio01();
		}
		machine.on();
		machine.work();
		machine.off();
	}

}









