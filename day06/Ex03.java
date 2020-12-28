package com.bit.day06;

class Ex03{

  public static void main(String[] args){
	// == 동등비교 연산자
	// 기본자료형 value값비교
	// 참조자료형 ref비교

	String st1="java";
	String st2="java";
	String st3=new String(st1);

	System.out.println(st1==st2);	//true
	System.out.println(st1.equals(st2));//true
	System.out.println(st1==st3);	//false
	System.out.println(st1.equals(st3));//true
  }

}