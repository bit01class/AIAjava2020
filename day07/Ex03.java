package com.bit.day07;

class Ex103{
  // 디자인 패턴 (싱글톤패턴)
  static Ex103 me=new Ex103();
  private Ex103(){}
  public void func(){
	System.out.println("func()...");
  }
}

class Ex03{

  public static void main(String[] args){
	Ex103 ex3=Ex103.me;
	ex3.func();
	Ex103 ex4=Ex103.me;
	ex4.func();
	Ex103 ex5=Ex103.me;
	ex5.func();
	//Math math=new Math();
	//System.out.println(Math.random());
  }

}