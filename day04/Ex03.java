package com.bit.day04;

class Ex03{
	//메서드 오버로드
  public static void func01(){
	System.out.println("매개변수가없는");
  }
  public static void func01(int a){
	System.out.println("인자하나:"+a);
  }
  public static void main(String[] args){
	com.bit.day04.Ex02.func01(2,3);
	java.lang.System.out.println();
	System.out.print(1234);
	System.out.println();
	System.out.print(3.14);
	System.out.print("출력");
  }













}