package com.bit.day08;

/*
 * �ֹι�ȣ üũ
 * 
 * 123456-1234567
 * ����� 00�� 0���Դϴ�
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
			System.out.print("�ֹι�ȣ�� �Է����ּ���\n>");
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
			gender='��';
		}else {
			gender='��';
		}
		System.out.println("����� "+age+"�� "+gender+"���Դϴ�");

	}

}








