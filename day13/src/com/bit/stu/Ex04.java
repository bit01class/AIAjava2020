package com.bit.stu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ex04 {

	public static void main(String[] args) {
		Map<Integer,int[]> data=new TreeMap<>();
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
				Set<Integer> keys = data.keySet();
				Iterator<Integer> ite = keys.iterator();
				while(ite.hasNext()) {
					int num=ite.next();
					int[] arr=data.get(num);
					System.out.println(num+"\t"+arr[0]+"\t"+arr[1]+"\t"+arr[2]);
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
				data.put(num, new int[] {kor,eng,math});
			}else if(input==3) {
				System.out.print("������ �й�>");
				int num=sc.nextInt();
				System.out.print("����>");
				int kor=sc.nextInt();
				System.out.print("����>");
				int eng=sc.nextInt();
				System.out.print("����>");
				int math=sc.nextInt();
				data.put(num, new int[] {kor,eng,math});
			}else if(input==4) {
				System.out.print("������ �й�>");
				int num=sc.nextInt();
				data.remove(num);
			}
		}
	}

}







