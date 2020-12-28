package com.bit.day05;

class Ex03{
  public int su;
  //생성자
  //객체 생성 시점에 하고 싶은 
  // 클래스명(매개변수,....){}
  // default생성자는 클래스에 생성자가 없을 때 자동create
  // 단, 생성자가 존재하면 안만들어줌
  // 객체 생성시 단 한번 호출가능합니다.
  // 오버로드 가능
  public Ex03(){}
  public Ex03(int a){
	su=a;
	System.out.println("객체 생성됐음");
	return;
  }

  public static void main(String[] args){

	Ex03 me=new Ex03(1234);
	System.out.println("su="+me.su);
  }

}