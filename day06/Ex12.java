package com.bit.day06;

class Ex12{

  public static void main(String[] args){
	String msg="Java Web      Framework";
	System.out.println(msg.contains("Web"));
	System.out.println(msg.startsWith("Java"));
	System.out.println(msg.startsWith("java"));
	System.out.println(msg.endsWith("Java"));
	System.out.println(msg.endsWith("work"));
	String msg2="abcd";
	char[] arr1=new char[10];
	msg2.getChars(0,msg2.length(),arr1,0);
	for(int i=0; i<arr1.length; i++){
		System.out.println(arr1[i]);
	}
	System.out.println(msg.toUpperCase());
	System.out.println(msg.toLowerCase());
	String msg3="       a b cd       ";
	System.out.println("#####"+msg3+"#####");
	System.out.println("#####"+msg3.trim()+"#####");
	String msg4="java,web,db,framework";
	String[] sts=msg4.split(",");
	for(int i=0; i<sts.length; i++){
		System.out.println(sts[i]);
	}
  }

}




