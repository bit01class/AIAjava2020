package com.bit.stu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		List<Integer> data=new ArrayList<>();
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
				Iterator<Integer> ite = data.iterator();
				while(ite.hasNext()) {
					int num=ite.next();
					System.out.print(num+"\t");
					int kor=ite.next();
					System.out.print(kor+"\t");
					int eng=ite.next();
					System.out.print(eng+"\t");
					int math=ite.next();
					System.out.println(math);
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
				data.add(num);
				data.add(kor);
				data.add(eng);
				data.add(math);
				
			}else if(input==3) {
				System.out.print("������ �й�>");
				int num=sc.nextInt();
				for(int i=0; i<data.size(); i+=4) {
					int su=data.get(i);
					if(num==su) {
						System.out.print("����>");
						data.set(i+1, sc.nextInt());
						System.out.print("����>");
						data.set(i+2, sc.nextInt());
						System.out.print("����>");
						data.set(i+3, sc.nextInt());
					}
				}
			}else if(input==4) {
				System.out.print("������ �й�>");
				int num=sc.nextInt();
				for(int i=0; i<data.size(); i+=4) {
					int su=data.get(i);
					if(num==su) {
						data.remove(i);
						data.remove(i);
						data.remove(i);
						data.remove(i);
					}
				}
			}
		}
	}

}







