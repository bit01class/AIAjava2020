package com.bit.stu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		List<int[]> data=new ArrayList<>();
		String title="�л������������α׷�(ver 0.5.0)";
		System.out.println(title);
		byte[] by=title.getBytes();
		for(int i=0; i<by.length; i++) {
			System.out.print('-');
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String header="----------------------------------------";
		header+="\n�й�\t����\t����\t����";
		header+="\n----------------------------------------";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>";
		int input=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0) {break;}
			if(input==1) {
				System.out.println(header);
				for(int i=0; i<data.size(); i++) {
					int[] stu=data.get(i);
					System.out.println(stu[0]+"\t"
							+stu[1]+"\t"+stu[2]+"\t"+stu[3]);
				}
			}else if(input==2) {
				System.out.print("�й�>");
				int num=sc.nextInt();
				System.out.print("����>");
				int kor=sc.nextInt();
				System.out.print("����>");
				int eng=sc.nextInt();
				System.out.print("����>");
				int math=sc.nextInt();
				int[] stu= {num,kor,eng,math};
				data.add(stu);
			}else if(input==3) {
				System.out.print("������ �й�>");
				int num=sc.nextInt();
				
				for(int i=0; i<data.size(); i++) {
					int[] stu=data.get(i);
					if(stu[0]==num) {
						int[] newStu=new int[4];
						newStu[0]=num;
						System.out.print("����>");
						newStu[1]=sc.nextInt();
						System.out.print("����>");
						newStu[2]=sc.nextInt();
						System.out.print("����>");
						newStu[3]=sc.nextInt();
						data.set(i, newStu);
						break;
					}
				}
				
			}else if(input==4) {
				System.out.print("������ �й�>");
				int num=sc.nextInt();
				for(int i=0; i<data.size(); i++) {
					int[] stu=data.get(i);
					if(stu[0]==num) {
						data.remove(i);
						break;
					}
				}
			}
		}
	}

}







