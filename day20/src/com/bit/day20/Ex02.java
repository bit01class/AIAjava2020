package com.bit.day20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			is=new FileInputStream("src/com/bit/day20/Ex01.java");
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			String msg=null;
			while((msg=br.readLine())!=null) {
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) {br.close();}
				if(isr!=null) {isr.close();}
				if(is!=null) {is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
