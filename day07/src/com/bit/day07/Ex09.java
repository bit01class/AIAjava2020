package com.bit.day07;

class Ex109{
	Ex109(){
		System.out.println("부모생성");
	}
}

class Ex09 extends Ex109{

  Ex09(){
	this("자식생성..");
  }
  Ex09(String msg){
	this(msg,1);
  }
  Ex09(String msg, int su){
	super();
	for(int i=0; i<su; i++){
	System.out.println(msg);
	}
  }

  public static void main(String[] args){
	Ex09 me=new Ex09("두번",2);
  }

}


