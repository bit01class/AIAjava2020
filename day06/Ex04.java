package com.bit.day06;

class Ex04{

  public static void main(String[] args){
	String st1="문자";
	String st2="열";
	String st3=st1+st2;
	String st4=st1+"열";
	String st5=st1+"열";
	String st6="문자열";
	String st7="문자"+"열";
	String st8="문자".concat("열");
	
	System.out.println(st1+st2);
	System.out.println(st3==st4);
	System.out.println(st1==st5);
	System.out.println(st6==st7);
	System.out.println(st6==st8);

  }

}


