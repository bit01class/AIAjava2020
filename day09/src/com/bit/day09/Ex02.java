package com.bit.day09;

public class Ex02 {

	public static void main(String[] args) {
		func();
	}
	public static void func() {
		int[] arr= {-2,-1,0,1,2};
		
		for(int i=0;i<6; i++) {
			int su=0;
			try {
					su=1/arr[i];
					
			}catch(ArithmeticException e) {
				su=-100;
				System.out.println(e.toString());
				StackTraceElement[] trace = e.getStackTrace();
				for(int j=0; j<trace.length; j++) {
					System.out.println(trace[j].toString());
				}
				e.printStackTrace();
			}catch(ArrayIndexOutOfBoundsException e) {
				su=100;
//				System.out.println(e.toString());
//				System.out.println(e.getMessage());
//				System.out.println(e.getLocalizedMessage());
				
				
			}catch(Exception e) {
				System.out.println("모르는 에러가 밸생했었음");
			}
			System.out.println(su);
		}

	}

}
