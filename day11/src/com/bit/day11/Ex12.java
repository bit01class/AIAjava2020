package com.bit.day11;

import java.util.Scanner;

class Student{
	int num;
	int kor,eng,math;
}

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title= "�л��������� ���α׷�(var 0.4.2)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����> ";
		String table="-----------------------------------------";
		table+="\n�й�\t����\t����\t����";
		table+="\n-----------------------------------------";
		System.out.print("�ѿ�> ");
		int input=sc.nextInt();
		Student[] data=new Student[input];
//		for(int i=0; i<data.length; i++) {
//			data[i]=new Student();
//		}
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			
			if(input==0) {break;}
			if(input==1) {
				System.out.println(table);
				for(int i=0; i<data.length; i++) {
					Student stu=data[i];
					if(stu==null) {continue;}
					System.out.println(stu.num+"\t"+stu.kor
								+"\t"+stu.eng+"\t"+stu.math);
				}
			}
			if(input==2) {
				System.out.print("�й�> ");
				int num=sc.nextInt();
				System.out.print("����> ");
				int kor=sc.nextInt();
				System.out.print("����> ");
				int eng=sc.nextInt();
				System.out.print("����> ");
				int math=sc.nextInt();
				Student stu=new Student();
				stu.num=num;
				stu.kor=kor;
				stu.eng=eng;
				stu.math=math;
				data[num-1]=stu;
			}
			if(input==3) {
				System.out.print("������ �й�> ");
				int num=sc.nextInt();
				System.out.print("����> ");
				int kor=sc.nextInt();
				System.out.print("����> ");
				int eng=sc.nextInt();
				System.out.print("����> ");
				int math=sc.nextInt();
				Student stu=new Student();
				stu.num=num;
				stu.kor=kor;
				stu.eng=eng;
				stu.math=math;
				data[num-1]=stu;
			}
			if(input==4) {
				System.out.print("�й�> ");
				int num=sc.nextInt();
				data[num-1]=null;
			}
		}
		
		System.out.println("�̿����ּż� �����մϴ�");
	}

}






