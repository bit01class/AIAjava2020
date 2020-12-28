package com.bit.day06;

class Ex01{

  public static void main(String[] args){
	Ex01 me=new Ex01();
	String st1="문자열";
	String st2=new String(st1);
	String st3=new String(st1);
	String st4="문자열";
	String st5=new String(st4);
	String st6="문자"+"열";

	System.out.println(st1==st4);//true
	System.out.println(st3==st5);//false
	System.out.println(st2==st3);//false
	System.out.println(st1==st6);//true
	System.out.println(st1==st2);//false
  }

}