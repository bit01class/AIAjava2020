package com.bit.day04;

class Ex06{
  // 메서드
  // static메서드, 클래스메서드,...
  // non-static 메서드, 인스턴스 메서드, 멤버메서드...
  // call 
  /*
static -> static		클래스로접근
static -> non-static		참조변수로접근
non-static -> non-static	바로접근(타클래스:참조변수)
non-static -> static		클래스로접근
  */
// 오버로드
// 1. 매개변수(인수) 유무
// 2. 매개변수 갯수
// 3. 매개변수 타입

  public static void func01(){
	System.out.println("static-method...");
	String msg="문자열";
	Ex06 me;		//변수의 선언, 참조변수
	me=new Ex06();	//초기화
	me.func02(124);
  }
  public static void func04(){
	System.out.println("static-func04");
  }
  public void func02(String msg){
	System.out.println("non-static method...");
  }
  public int func02(int a){
	System.out.println("non-static method...");
	return a;
  }
  public void func03(){
	Ex06.func04();
  }
  public static void main(String[] args){
	func01();  // Ex06.func01();
		

  }

}



