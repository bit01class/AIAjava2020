package com.bit.day04;

class Ex01{
	// 클래스 구성요소
	// 메서드
// public static 자료형(void) 메서드명(매개변수, ...){}
// 자료형의 결정은 return value이 결정, value가 없으면 void
// 메서드의 호출 -> 메서드명(전달할 값,....)

  public static void main(String[] args){
     System.out.println("hello world");
     int su=func01();
     func02();
     System.out.println("su="+su);
     return;
  }
  public static int func01(){
     System.out.println("func01()...");
     return 1234;
  }
  public static void func02(){
     System.out.println("func02()...");
     return;
  }

}






