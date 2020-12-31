package com.bit.day18;

public class Ex06 {
	// 단한번만 객체를 찍어내고 기능을 쓰기위해
	
	static Inter inn3=new Inter(){
		public void func02() {
			System.out.println("스테틱클래스기능");
		}
	};
	
	Inter inn2=new Inter(){
		public void func02() {
			System.out.println("인스턴스클래스기능");
		}
	};

	public static void main(String[] args) {
		Inter inn1=new Inter(){
			public void func02() {
				System.out.println("로컬클래스기능");
			}
			
		};

	}

}
