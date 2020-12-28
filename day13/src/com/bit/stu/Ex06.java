package com.bit.stu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		String title="학생성적관리프로그램(ver 0.5.0)";
		System.out.println(title);
		byte[] by=title.getBytes();
		for(int i=0; i<by.length; i++) {
			System.out.print('-');
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>";
		int input=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0) {break;}
			if(input==1) {
				
			}else if(input==2) {
				System.out.print("학번>");
				int num=sc.nextInt();
				System.out.print("국어>");
				int kor=sc.nextInt();
				System.out.print("영어>");
				int eng=sc.nextInt();
				System.out.print("수학>");
				int math=sc.nextInt();
				
			}else if(input==3) {
				
			}else if(input==4) {
				
			}
		}
	}

}







