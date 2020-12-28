package com.bit.day10;

// 인터페이스
//오직 추상메서드와 상수(상수형변수)
interface Inter01{
	public abstract void func01(int a);
}

interface Inter02{
	public void func02();
	void func03();
}

interface Inter03 extends Inter01,Inter02{}

interface Inter04{
	public final static int su1=1111;
	final static int su2=2222;
	static int su3=3333;
	int su4=4444;
}

class Test05{}
public class Ex05 extends Ex04
			implements Inter04{

	public static void main(String[] args) {
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		System.out.println(Inter04.su4);
		Inter04 me=new Ex05();
	}
}
