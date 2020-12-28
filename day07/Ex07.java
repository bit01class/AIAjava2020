package com.bit.day07;

class Ex107{
	int su1=1111;

	Ex107(){
		System.out.println("부모객체생성");
	}
	
	void func01(){
		System.out.println("부모기능..");
	}
}

class Ex07 extends Ex107{
  private int su1=2222;

  Ex07(){
	super();
	System.out.println("자식객체 생성");
	System.out.println(">"+su1);
	System.out.println(">"+this.su1);
	System.out.println(">"+super.su1);
  }

  // 오버라이드(메서드만)
  // 부모의 기능을 재정의함
  void func01(){
	super.func01();
	System.out.println("자식기능...");
  }

  public static void main(String[] args){
	Ex07 me=new Ex07();
	me.func01();
	System.out.println(me.su1);
  }

}




