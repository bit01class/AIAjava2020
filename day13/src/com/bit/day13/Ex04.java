package com.bit.day13;

class Ball{
	
	void play() {
		System.out.println(" ���� �������ϴ�");
	}
}

class BaseBall extends Ball{
	String color="���";
	
	void play() {
		System.out.println(color+" �߱����� ������ ��ϴ�");
	}
}

class Bowling extends Ball{
	String color="��Ȳ��";
	
	void play() {
		System.out.print("���� ���� "+color+" ����");
		super.play();
	}
}

// T,E,K,V,...
class Box<T>{
	T ball;
	
	void push(T myball) {
		ball=myball;
	}
	T pull() {
		return ball;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		BaseBall ball1=new BaseBall();
		Bowling ball2=new Bowling();

		Box<Ball> box=new Box<Ball>();
		box.push(ball2);
		
		//~~~~
		Ball myball=box.pull();
		myball.play();
	}

}







