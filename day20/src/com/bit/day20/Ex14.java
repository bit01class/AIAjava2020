package com.bit.day20;

public class Ex14 extends Thread {

	public static void main(String[] args) {
		Ex14 me=new Ex14();
		me.setName("첫번째");
		Ex14 you=new Ex14();
		you.setName("두번째");
		Ex14 you2=new Ex14();
		you2.setName("세번째");
		me.setPriority(Thread.MIN_PRIORITY);
		you.setPriority(Thread.MAX_PRIORITY);
		you2.setPriority(Thread.NORM_PRIORITY);
		me.start();
		you.start();
		you2.start();
		System.out.println(me.getName()+"의 순위는 "
							+me.getPriority());
		System.out.println(you.getName()+"의 순위는 "
							+you.getPriority());
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(getName()+i);
		}
	}

}
