package com.bit.day19;

public class Ex08 {
	public void func01() {
		System.out.println("부모의기능");
	}

	public static void main(String[] args) {
		// 다형성
		Ex08 me=new Ex08();
		Object me2=new Ex08();
		Ex08 me3=new Ex08() {
			@Override
			public void func01() {
				System.out.println("자식의기능");
			}
		};
		me3.func01();
		
	}

}
