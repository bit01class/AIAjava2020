package com.bit.day07;

class Ex108{
  int su1=1111;
  void func01(){
	System.out.println("부모기능");
  	//System.out.println("super.su1="+super.su1);
  	System.out.println("this.su1="+this.su1);
  	System.out.println("su1="+su1);
  }
}

class Ex08 extends Ex108{
  int su1=2222;
  
  void func01(){
	System.out.println("자식기능");
  	System.out.println("super.su1="+super.su1);
  	System.out.println("this.su1="+this.su1);
  	System.out.println("su1="+su1);
  }

  void func02(){
	System.out.println("자식만의 기능...");
  }
  
  public static void main(String[] args){
	Ex108 you=new Ex108();
	you.func01();
	System.out.println("------------------------");
	Ex08 me=new Ex08();
	me.func01();
	System.out.println(me.su1);
	me.func02();
	System.out.println(">------------------------");
	// 다형성
	Ex108 ex1=new Ex08();
	ex1.func01();
	System.out.println(me.su1);
	((Ex08)ex1).func02();
	System.out.println(">------------------------");
	Object obj=new Ex08();
	System.out.println(obj.toString());
	System.out.println("------------------------");
	String msg="abcd";
	
	me.func03(true);
	
  }
  void func03(Object obj){
	System.out.println(obj.toString());
  }

}




