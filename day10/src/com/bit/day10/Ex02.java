package com.bit.day10;

//추상클래스
// 추상메서드 0개 이상 갖는 클래스
// 상속을 통해 사용하라
abstract class Test02{
	int su=1111;
	public Test02() {
	}
	public void func01() {}
	//추상메서드 - 메서드 선언(o), 구현(x)
//	public abstract void func02();
//	public abstract void func03();
}

public class Ex02 extends Test02{
	
//	public void func02() {};
//	public void func03() {};

	public static void main(String[] args) {
//		Test02 test=new Test02();
		Ex02 me=new Ex02();
		me.func01();
	}

}
