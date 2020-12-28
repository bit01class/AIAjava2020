package com.bit.day06;

class Ex11{

  public static void main(String[] args){
	String msg="ABCD abcd Abc";
	for(int i=0; i<msg.length(); i++){
	char ch1=msg.charAt(i);
	System.out.println(ch1);
	}
	String result=msg.concat("추가");
	System.out.println(result);
	System.out.println(msg);
	System.out.println(msg.equals("ABCD abcd 한글"));
	int su1=msg.indexOf("Ab",2);
	System.out.println(su1);
	String msg2=null;
	System.out.println(msg2==null);
	//System.out.println(msg2.isEmpty());
	System.out.println(msg.lastIndexOf('A'));
	System.out.println(msg.length());
	System.out.println(msg.replace('c','@'));
	System.out.println(msg);
	System.out.println(msg.replace("abc","ab@"));
	System.out.println(msg.replaceFirst("c","#"));
	System.out.println(msg.substring(5));
	System.out.println(msg.substring(5,msg.length()));
	String msg3=String.valueOf(1234);
	System.out.println(msg3);
	char[] chs={'a','b','c'};
	System.out.println(new String(chs));
	System.out.println(String.valueOf(chs));
  }

}




