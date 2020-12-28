package com.bit.day13;

class Ball{
	
	void play() {
		System.out.println(" 공이 굴러갑니다");
	}
}

class BaseBall extends Ball{
	String color="흰색";
	
	void play() {
		System.out.println(color+" 야구공을 던지고 놉니다");
	}
}

class Bowling extends Ball{
	String color="주황색";
	
	void play() {
		System.out.print("핀을 향해 "+color+" 볼링");
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







