package com.bit.day20;

public class Ex14 extends Thread {

	public static void main(String[] args) {
		Ex14 me=new Ex14();
		me.setName("ù��°");
		Ex14 you=new Ex14();
		you.setName("�ι�°");
		Ex14 you2=new Ex14();
		you2.setName("����°");
		me.setPriority(Thread.MIN_PRIORITY);
		you.setPriority(Thread.MAX_PRIORITY);
		you2.setPriority(Thread.NORM_PRIORITY);
		me.start();
		you.start();
		you2.start();
		System.out.println(me.getName()+"�� ������ "
							+me.getPriority());
		System.out.println(you.getName()+"�� ������ "
							+you.getPriority());
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(getName()+i);
		}
	}

}
