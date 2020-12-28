package com.bit.day09;

public class Ex06 {
	
	public static void func(int a) throws ArithmeticException{
		// ~jdk 1.6 1.7
		try {
			int su=10/a;
			if(a==0) {return;}
			System.out.println(su);
			
		}finally {
			System.out.println("반드시 수행함");			
		}
	}

	public static void main(String[] args) {
		try {
		func(0);
		}catch (ArithmeticException e) {
			System.out.println("예외처리함");
		}

	}

}
