package com.bit.day07;

final class Ex105  extends java.lang.Object{
  public void func01(){
	System.out.println("func01 run...");
  }
}

public class Ex05 extends Ex105{

  public static void main(String[] args){
	Ex05 me=new Ex05();
	System.out.println(me);
	System.out.println(me.toString());
  }

}