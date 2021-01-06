package com.bit.day19;

import java.security.cert.CertificateEncodingException;

public class Ex03 {
	
	static void func02() {
		int su=0;
		for(int i=0; i<10; i++) {
//			if(i!=0) {continue;}//반복문의 제어권
			System.out.println("반복");
//			if(){break;}//제어문의 제어권(if문 제외)
			return;// 메서드의 제어권
			
		}
//		System.out.println("반복문뒤");
		return;
	}

	static void func01() {
		return;
	}
	
	public static void main(String[] args) {
		// return - 
		// 메서드의 종료
		// 호출한쪽으로 돌아간다
		// 스택에서 pull
		
		func02();
		
		return;
	}

}
