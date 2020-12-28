package com.bit.day04;

class Ex07{
  //클래스의 구성요소 2.변수(전역변수)
  // static 변수, 클래스변수...
  public static int su1=1234;
  // 인스턴스변수, 멤버필드
  public int su2=4321;


  public void func01(){
	// 지역변수>전역변수 
	int su1=1111;
	int su2=2222;
	System.out.println(su1);
	System.out.println(su2);
  }
  public static void main(String[] args){
	int su1=1111;
	int su2=2222;
	System.out.println(Ex07.su1);
	System.out.println(su2);
	Ex07 me = null;
	me=new Ex07();
	System.out.println(me.su2);
	me=new Ex07();
	//me.func01();
  }

}


