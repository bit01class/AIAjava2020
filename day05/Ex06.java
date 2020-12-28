package com.bit.day05;

class Ex06{
  public int su=1111;
  public Ex06 func02(){
	System.out.println("func02 run...");
	return this;
  }
  public void func01(){
	int su=2222;
	//this.func02();
	System.out.println(this.su);
  }

  public static void main(String[] args){
	Ex06 me=new Ex06();
	//System.out.println(me==me);
	//System.out.println(me.su);	
	me.func02().func02().func02().func02();
  }

}






