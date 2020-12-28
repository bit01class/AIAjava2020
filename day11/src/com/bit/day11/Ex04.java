package com.bit.day11;

public class Ex04 {

	public static void main(String[] args) {
		// buffer -> +16
		StringBuffer st1=new StringBuffer();
		StringBuffer st2=new StringBuffer(10);
		StringBuffer st3=new StringBuffer("java");
		

		System.out.println(st1.capacity());
		for(int i=0; i<16; i++) {
		System.out.println(st1.append("a"));
		}
		System.out.println(st1.capacity());//16
		System.out.println(st1.append("b"));
		System.out.println(st1.capacity());//17*2
		st1.trimToSize();
		System.out.println(st1);
		System.out.println(st1.capacity());//17
//		System.out.println(st2.capacity());
//		System.out.println(st3.capacity());

	}

}







