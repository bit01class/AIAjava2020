package com.bit.day07;

public class Ex06{

  public static void main(String[] args) throws Exception{
	Object obj=new Object();
	String msg=obj.toString();
	System.out.println(msg);
	Object obj2=new Object();
	System.out.println(obj.equals(obj2));
	Object obj3=obj;
	System.out.println(obj.equals(obj3));
	System.out.println(obj.hashCode());
	Ex06 me=new Ex06();
	Object obj4=me.clone();
	//System.out.println(obj4);
  }

}



