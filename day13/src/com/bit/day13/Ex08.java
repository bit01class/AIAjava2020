package com.bit.day13;

import java.util.Scanner;


class Ex88{
	private static Scanner sc;
	
	private Ex88(){}
	static Scanner getScanner() {
		if(sc==null) {sc=new Scanner(System.in);}
		return sc;
	}
}

public class Ex08 {
	
	public static String input() {
		return Ex88.getScanner().nextLine();
	}

	public static void main(String[] args) {
		System.out.print("ù��° �Է�>");
		System.out.println("�Է��Ͻ� ������ "+input());
		System.out.print("�ι�° �Է�>");
		System.out.println("�Է��Ͻ� ������ "+input());
		System.out.print("����° �Է�>");
		System.out.println("�Է��Ͻ� ������ "+input());
//		Node node1=new Node();
//		node1.func();
//		
//		Node node2=new Node();
//		node2.func();
//		
//		
//		Node node3=new Node();
//		node3.func();

	}

}
