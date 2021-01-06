package com.bit.day20;

public class Ex10 extends Thread {
	public static void main(String[] args) {
		System.out.println("메인스레드시작");
		
		Ex10 me=new Ex10();
		Ex10 me2=new Ex10();
		
		me.start();
		me2.start();
		
		System.out.println("메인스레드종료");
		return;
	}
	
	@Override
	public void run() {
		System.out.println("새로운 스레드시작");
		System.out.println("새로운 스레드종료");
	}
}
