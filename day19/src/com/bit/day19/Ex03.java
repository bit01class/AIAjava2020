package com.bit.day19;

import java.security.cert.CertificateEncodingException;

public class Ex03 {
	
	static void func02() {
		int su=0;
		for(int i=0; i<10; i++) {
//			if(i!=0) {continue;}//�ݺ����� �����
			System.out.println("�ݺ�");
//			if(){break;}//����� �����(if�� ����)
			return;// �޼����� �����
			
		}
//		System.out.println("�ݺ�����");
		return;
	}

	static void func01() {
		return;
	}
	
	public static void main(String[] args) {
		// return - 
		// �޼����� ����
		// ȣ���������� ���ư���
		// ���ÿ��� pull
		
		func02();
		
		return;
	}

}
