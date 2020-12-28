package com.bit.day05;

class Ex04{
	// final 상수형변수
	//public final static int b;
	public final int d;
  public Ex04(){d=4444;}
  public Ex04(int a){d=a;}
  public static void main(String[] args){
	final int a;//변수선언
	a=1234;//변수초기화
	//b=4321;
	Ex04 me=new Ex04();
	System.out.println("d="+me.d);
	me=new Ex04(a);
	System.out.println("d="+me.d);
  }

}