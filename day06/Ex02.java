package com.bit.day06;

class Ex02{

   public static void main(String[] args){
	String st1="java";
	String st2="java";
	String st3=args[0];
	if("java"==st2){
		System.out.println("st1==st2");
	}else{
		System.out.println("st1!=st2");
	}
	if("java"==st3){
		System.out.println("st1==st3");
	}else{
		System.out.println("st1!=st3");
	}
	switch(st3){
		case "java":
		System.out.println("st1==st3");
		break;
		default:
		System.out.println("st1!=st3");
	}
   }

}







