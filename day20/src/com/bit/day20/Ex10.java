package com.bit.day20;

public class Ex10 extends Thread {
	public static void main(String[] args) {
		System.out.println("���ν��������");
		
		Ex10 me=new Ex10();
		Ex10 me2=new Ex10();
		
		me.start();
		me2.start();
		
		System.out.println("���ν���������");
		return;
	}
	
	@Override
	public void run() {
		System.out.println("���ο� ���������");
		System.out.println("���ο� ����������");
	}
}
