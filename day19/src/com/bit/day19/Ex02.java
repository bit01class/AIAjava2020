package com.bit.day19;
/*
1. ������ ����������Ŭ
2. return~~~
3. super & this
4. �߻�Ŭ���� & �������̽�
5. ������
6.Object clone
7.List&set
8.compareTo
9. byte stream

 * */
public class Ex02 {
	// �������� - Ŭ�����ܿ� ����� ����
	static int su1; //Ŭ��������
	int su2;	// �ɹ��ʵ�, �ν��Ͻ�����
	String msg;
	Ex02 you=null;
	public static void plus(int a,int b) {
		su1=a+b;
	}

	public static void main(String[] args) {
		//������ ����������Ŭ
		// ��������- �޼��� ���ο��� ����� ����
		// 			�޼��� ���ο�����
		int a;
		String msg;
		Ex02 me;
		int x,y;
		x=100;
		y=10;
		plus(100,10);
		System.out.println(su1);
		
	}

}
