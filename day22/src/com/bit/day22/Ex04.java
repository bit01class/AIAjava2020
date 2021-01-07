package com.bit.day22;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex04 {

	public static void main(String[] args) {
		String spec="https://www.naver.com/";
//		프로토콜://도메인(ip):포트번호/패스?쿼리#앵커
		// 프로토콜 http, https
		
		// 포트 - 80(http), 443(https)
		/*
		 0번 ~ 1023번: 잘 알려진 포트 (well-known port)
		 1024번 ~ 49151번: 등록된 포트 (registered port)
		 49152번 ~ 65535번: 동적 포트 (dynamic port)
		 */
		// 패스 - 요청페이지
		// 쿼리 - 정보전달
		// 앵커 - 
		
		java.net.URL url=null;
		
		try {
			url=new URL(spec);
			System.out.println("프로토콜:"+url.getProtocol());
			System.out.println("도메인:"+url.getHost());
			System.out.println("포트1:"+url.getPort());
			System.out.println("포트2:"+url.getDefaultPort());
			System.out.println("패스:"+url.getPath());
			System.out.println("url쿼리:"+url.getQuery());
			System.out.println(url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
