package com.bit.day18;

abstract class Lec07{
	public abstract void func01();
}

interface Inter07{
	void func02();
}

public class Ex07 {

	public static void main(String[] args) {
		Lec07 ex01=new Lec07() {
			public void func01() {
				System.out.println();
			}
		};
		Inter07 ex02=new Inter07() {
			public void func02() {
				System.out.println();
			}
		};

	}

}
