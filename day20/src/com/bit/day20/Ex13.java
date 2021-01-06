package com.bit.day20;

public class Ex13 implements Runnable{

	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		System.out.println(name+" thread...");
		Thread me=new Thread(new Ex13(),"첫번째");
		Thread you=new Thread(new Ex13());
		you.setName("두번째");
		me.start();
		you.start();
	}

	@Override
	public void run() {
		Thread me=Thread.currentThread();//getName();
		System.out.println(me.getName()+" thread...");
	}
}








