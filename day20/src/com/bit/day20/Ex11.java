package com.bit.day20;

public class Ex11 implements Runnable{

	public static void main(String[] args) {
		System.out.println("main start...");
		Ex11 me=new Ex11();
		Thread thr1=new Thread(me);
		Thread thr2=new Thread(me);
		thr1.start();// 스레드로 시작
		thr2.start();
		System.out.println("main end...");
	}

	@Override
	public void run() {
		System.out.println("work...");
	}

}
