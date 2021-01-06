package com.bit.day20;

public class Ex12 {

	public static void main(String[] args) {
		Thread thr1=new Thread() {
			@Override
			public void run() {
				System.out.println("work...");
			}
		};
		
		Thread thr2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("work2...");
			}
		});
		thr1.start();
		thr2.start();
	}

}
