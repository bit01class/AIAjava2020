package com.bit.day08;

/*
 * 주민번호 체크
 * 
 * 123456-1234567
 * 당신은 00세 0성입니다
 * 
*/

public class Ex09 {

	public static void main(String[] args) {
		int age=0;
		char gender='-';
		String input=null;
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		do{
			System.out.print("주민번호를 입력해주세요\n>");
			input=sc.nextLine();
			if(input.length()==14) {
				if(input.charAt(6)=='-') {
					boolean boo2=true;
					for(int i=0; i<input.length(); i++) {
						if(i==6) {continue;}
						char su=input.charAt(i);
						if(!Character.isDigit(su)) {boo2=false;}
					}
					if(boo2) {break;}
				}
			}
		}while(true);	
		age=2020-(1900+Integer.parseInt(input.substring(0,2)))+1;
		if(input.charAt(7)>'2') {
			age-=100;
		}
		if(input.charAt(7)=='1'&&input.charAt(7)=='3') {
			gender='남';
		}else {
			gender='여';
		}
		System.out.println("당신은 "+age+"세 "+gender+"성입니다");

	}

}








