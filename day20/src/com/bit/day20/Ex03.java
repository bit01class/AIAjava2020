package com.bit.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) {
		InputStream inn = System.in;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
		isr=new InputStreamReader(inn);
		br=new BufferedReader(isr);
		String msg=null;
		while(!(msg=br.readLine()).equals("exit")) {
			System.out.println(msg);
		}
		
		}catch(IOException e) {
		}finally {
			try {
				if(br!=null) {br.close();}
				if(isr!=null) {isr.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
