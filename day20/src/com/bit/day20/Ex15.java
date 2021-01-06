package com.bit.day20;

public class Ex15 {

	public static void main(String[] args) {
		System.out.println("start...");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("end...");
	}

}
