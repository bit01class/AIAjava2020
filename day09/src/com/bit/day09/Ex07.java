package com.bit.day09;
//
/*
 * 주번번호 체크
 * 123456-1234567
 * 000101~991231
 * String[] arr={"123456","1234567"};
 * 
 * 
*/
public class Ex07 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		String input="003456-4234567";
		while(true) {
			System.out.print("주민번호>");
			input=sc.nextLine();
			//valid
			String[] arr=input.split("-");
			if(arr.length!=2) {continue;}
			if(arr[0].length()!=6) {continue;}
			if(arr[1].length()!=7) {continue;}
			try {
				Integer.parseInt(arr[0]);
				Integer.parseInt(arr[1]);
			}catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		char ch=input.charAt(7);
		int su=Integer.parseInt(""+ch);
		
		if(su<=2) {
			input=19+input;				// 19123456-1234567
		}else {
			input=20+input;				// 20123456-4234567
		}
		input=input.substring(0,4);
		int age=2020-(Integer.parseInt(input))+1;
		
		
		if(su%2==0) {
			System.out.println(age+"세 여성입니다");
		}else {
			System.out.println(age+"세 남성입니다");
		}
	}

}











