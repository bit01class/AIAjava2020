package com.bit.day10;

import java.util.Scanner;

interface Machine02{
	void on();
	void work();
	void off();
}

class Tv02 implements Machine02{

	@Override
	public void on() {
		System.out.println("tv�� �Ѵ�");
	}

	@Override
	public void work() {
		System.out.println("ȭ���� ���δ�");
	}

	@Override
	public void off() {
		System.out.println("tv�� ����");
	}
	
}

class Radio02 implements Machine02{

	@Override
	public void on() {
		System.out.println("������ �Ѵ�");
	}

	@Override
	public void work() {
		System.out.println("�Ҹ��� ����ϴ�");
	}

	@Override
	public void off() {
		System.out.println("������ ����");
	}
	
}

public class Ex07 {

	public static void main(String[] args) {
		Machine02 machine;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("1.Tv 2.radio>");
		int input=Integer.parseInt(sc.nextLine());
		
		if(input==1) {
			machine=new Tv02();
		}else {
			machine=new Radio02();
		}
		machine.on();
		machine.work();
		machine.off();

	}

}










