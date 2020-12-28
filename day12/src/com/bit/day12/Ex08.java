package com.bit.day12;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// °è»ê±â
		Scanner sc=new Scanner(System.in);
		System.out.print(">");
		// 1+2, 5-3, 5*2, 5/2
		String input=sc.nextLine();
		String[] su=null;
		char[] ch={'+','-','*','/'};
		int i=-1;
		for(i=0; i<ch.length; i++) {
			su=input.split("\\"+ch[i]);
			if(su.length>1) {break;}
		}
		
		int su1=Integer.parseInt(su[0]);
		int su2=Integer.parseInt(su[1]);
		Number result=null;
		if(i==0) {
			result=su1+su2;
		}else if(i==1) {
			result=su1-su2;
		}else if(i==2) {
			result=su1*su2;
		}else if(i==3&&su1%su2==0) {
			result=su1/su2;
		}else if(i==3){
			result=su1*1.0/su2;
		}
		
		System.out.println(input+"="+result);
	}

}







