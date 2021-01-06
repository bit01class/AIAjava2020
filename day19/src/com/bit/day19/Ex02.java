package com.bit.day19;
/*
1. 변수의 라이프사이클
2. return~~~
3. super & this
4. 추상클래스 & 인터페이스
5. 다형성
6.Object clone
7.List&set
8.compareTo
9. byte stream

 * */
public class Ex02 {
	// 전역변수 - 클래스단에 선언된 변수
	static int su1; //클래스변수
	int su2;	// 맴버필드, 인스턴스변수
	String msg;
	Ex02 you=null;
	public static void plus(int a,int b) {
		su1=a+b;
	}

	public static void main(String[] args) {
		//변수의 라이프사이클
		// 지역변수- 메서드 내부에서 선언된 변수
		// 			메서드 내부에서만
		int a;
		String msg;
		Ex02 me;
		int x,y;
		x=100;
		y=10;
		plus(100,10);
		System.out.println(su1);
		
	}

}
