package com.bit.day19;

abstract class Lec05{
	// 추상클래스 - 추상메서드를 0개이상 갖는 클래스
	// 의의 : 반드시 상속을 통해 사용
	public Lec05() {
	}
	
	abstract void func01();
	void func02() {
		System.out.println("추상클래스의 구현된 메서드");
	}
}
public class Ex05 {

	public static void main(String[] args) {
		Lec05 lec=new Lec05() {

			@Override
			void func01() {
				
			}};

	}

}






