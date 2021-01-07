package com.bit.day22;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		String url="localhost";//"127.0.0.1";
		byte[] by;
		java.net.InetAddress addr=null;
		java.net.InetAddress[] addrs=null;
		try {
//			addr=InetAddress.getByName(url);
//			by=addr.getAddress();
//			
//			System.out.println(addr.getHostName());
//			System.out.println(addr.getCanonicalHostName());
//			System.out.println(addr.getHostAddress());
//			System.out.println(Arrays.toString(by));
			addrs=InetAddress.getAllByName(url);
			for(int i=0; i<addrs.length; i++) {
				System.out.println(addrs[i].getHostName());
				System.out.println(addrs[i].getCanonicalHostName());
				System.out.println(addrs[i].getHostAddress());
				System.out.println("-------------");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
