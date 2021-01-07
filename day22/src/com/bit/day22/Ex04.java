package com.bit.day22;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex04 {

	public static void main(String[] args) {
		String spec="https://www.naver.com/";
//		��������://������(ip):��Ʈ��ȣ/�н�?����#��Ŀ
		// �������� http, https
		
		// ��Ʈ - 80(http), 443(https)
		/*
		 0�� ~ 1023��: �� �˷��� ��Ʈ (well-known port)
		 1024�� ~ 49151��: ��ϵ� ��Ʈ (registered port)
		 49152�� ~ 65535��: ���� ��Ʈ (dynamic port)
		 */
		// �н� - ��û������
		// ���� - ��������
		// ��Ŀ - 
		
		java.net.URL url=null;
		
		try {
			url=new URL(spec);
			System.out.println("��������:"+url.getProtocol());
			System.out.println("������:"+url.getHost());
			System.out.println("��Ʈ1:"+url.getPort());
			System.out.println("��Ʈ2:"+url.getDefaultPort());
			System.out.println("�н�:"+url.getPath());
			System.out.println("url����:"+url.getQuery());
			System.out.println(url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
