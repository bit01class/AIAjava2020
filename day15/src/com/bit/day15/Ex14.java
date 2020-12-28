package com.bit.day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex14 {

	public static void main(String[] args) {
		File file =new File("test03.txt");
		
		char[] cbuf=new char[5];
		java.io.Reader rd=null;
		java.io.BufferedReader br=null;
		try {
			rd=new FileReader(file);
			br=new BufferedReader(rd);
			while(true) {
//				int su=br.read(cbuf);
//				if(su==-1) {break;}
				String msg=br.readLine();
				if(msg==null) {break;}
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rd!=null) {rd.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
