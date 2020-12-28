package com.bit.day13;

class Node{
	void func() {
		System.out.println("기능 실행...");
	}
}

class Template{
	static <T>Box<T> newInstance(T ball) {
		Box<T> box=new Box<T>();
		box.push(ball);
		return box;
	}
}

public class Ex09 {

	public static void main(String[] args) {
		BaseBall ball1=new BaseBall();
		
		Box<Bowling> box=Template.<Bowling>newInstance(new Bowling());
		box.pull().play();
	}

}






