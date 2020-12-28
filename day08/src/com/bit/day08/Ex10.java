package com.bit.day08;

public class Ex10 {
	public static void func01() {
		for(int i=0; i<10; i++) {
			if(i==5) {return;}
			System.out.println("return "+i);
		}
		System.out.println("return end");
	}

	public static void func02() {
		//break - switch,for,while,do~while 에서의 탈출
		
		for(int i=0; i<10; i++) {
			if(i==5) {break;}
			System.out.println("break "+i);
		}
		System.out.println("break end");
	}

	public static void func03() {
		// continue - 반복문에서만 쓰임
		for(int i=0; i<10; i++) {
			if(i==5||i==9) {continue;}
			System.out.println("continue "+i);
		}
	}

	public static void main(String[] args) {
		func01();
		func02();
		func03();
		

	}

}
