package com.bit.stu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		String title="�л������������α׷�(ver 0.5.0)";
		System.out.println(title);
		byte[] by=title.getBytes();
		for(int i=0; i<by.length; i++) {
			System.out.print('-');
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>";
		int input=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0) {break;}
			if(input==1) {
				
			}else if(input==2) {
				System.out.print("�й�>");
				int num=sc.nextInt();
				System.out.print("����>");
				int kor=sc.nextInt();
				System.out.print("����>");
				int eng=sc.nextInt();
				System.out.print("����>");
				int math=sc.nextInt();
				
			}else if(input==3) {
				
			}else if(input==4) {
				
			}
		}
	}

}







