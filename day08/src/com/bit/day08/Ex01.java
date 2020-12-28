package com.bit.day08;

public class Ex01 {
	//래퍼클래스
	// 기본자료형의 객체타입
	// boxing,랩핑 : 기본자료형 -> 객체화
	// unboxing,언랩핑 : 객체타입 -> 기본자료형
	
	public static void func01(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		func01(new Ex01());
		func01("abcd");
		func01(new int[] {1,3,5,7});
		func01(1234);

	}

}
