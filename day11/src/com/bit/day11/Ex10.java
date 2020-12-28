package com.bit.day11;

import java.util.Scanner;

public class Ex10 {
	/*
	 * \n1 93 81 72
	 * \n2 91 31 71
	 * \n3 92 92 82
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		StringBuffer data=new StringBuffer(14);
		Scanner sc=new Scanner(System.in);
		String title= "학생성적관리 프로그램(var 0.4.0)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료> ";
		String table="-----------------------------------------";
		table+="\n학번\t국어\t영어\t수학";
		table+="\n-----------------------------------------";
		System.out.println(title);
		int input=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0) {break;}
			if(input==1) {
				System.out.print(table);
				System.out.println(data);
			}
			if(input==2) {
				System.out.print("학번> ");
				int num=sc.nextInt();
				data.append("\n"+num);
				System.out.print("국어> ");
				int kor=sc.nextInt();
				data.append("\t"+kor);
				System.out.print("영어> ");
				int eng=sc.nextInt();
				data.append("\t"+eng);
				System.out.print("수학> ");
				int math=sc.nextInt();
				data.append("\t"+math);
			}
			if(input==3) {
				System.out.print("수정할 학번> ");
				int num=sc.nextInt();
				int start=data.indexOf("\n"+num+"\t");
				if(start<0) {
					System.out.println("존재하지 않는 학번입니다");
					continue;
					}
				int end=data.indexOf("\n",start+1);
				if(end<0) {	
					end=data.length();
				}
				System.out.println("start:"+start);
				System.out.println("end:"+end);
				System.out.print("국어> ");
				int kor=sc.nextInt();
				System.out.print("영어> ");
				int eng=sc.nextInt();
				System.out.print("수학> ");
				int math=sc.nextInt();
				
				String line="\n"+num+"\t"+kor+"\t"+eng+"\t"+math;
				data.replace(start, end, line);
			}
			
			if(input==4) {
				System.out.print("삭제할 학번> ");
				int num=sc.nextInt();
				int start=data.indexOf("\n"+num+"\t");
				if(start<0) {
					System.out.println("존재하지 않는 학번입니다");
					continue;
					}
				int end=data.indexOf("\n",start+1);
				if(end<0) {	
					end=data.length();
				}
				data.delete(start, end);
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}







