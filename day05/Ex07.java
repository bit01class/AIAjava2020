package com.bit.day05;

class Ex07{
  public int su=1111;

  public Ex07(){
	//su=2222;
	this(2222);
	System.out.println(this);
  }
  public Ex07(int su){
	this.su=su;
	System.out.println(this);
  }

  public static void main(String[] args){
	Ex07 me=new Ex07();
	System.out.println(me);
  }

}