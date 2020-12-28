package com.bit.day09;

public class Ex01 {

	public static void main(String[] args) {
		// 예외처리
		try {
		
			int[] arr1= {1,3,5,7};
			
			for(int i=0; i<5; i++) {
					System.out.println(arr1[i]);
			}
	
			System.out.println("오류가 있었지만 회피함");
		}catch (ArrayIndexOutOfBoundsException ex) {
		}
	}

}








