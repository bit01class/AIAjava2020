package com.bit.day18;

class Outter04{
	static int su1=1111;
	int su2=2222;
	
	static void func02(final int su5) {
//		final int su5=5555;
		System.out.println(su5);
		class Inner04{
			final static int su3=3333;
			int su4=4444;
			
			public Inner04() {
				System.out.println("create Inner");
			}
			
			void func04() {
				System.out.println("Inner func04()");
				System.out.println("su4="+su4);
				System.out.println("su1="+su1);
				System.out.println("su5="+su5);
			}
		}
		System.out.println(su5);
		Inner04 inn=new Inner04();
		System.out.println(inn.su4);
		inn.func04();
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		Outter04.func02(777777);
	}

}
