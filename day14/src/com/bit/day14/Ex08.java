package com.bit.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		File file=new File("target01.txt");
		// ByteStream
		// 1byte
		// ¥‹¿œ input&output
		java.io.InputStream is;
		try {
			is=new java.io.FileInputStream(file);
			while(true) {
				int su=is.read();
				if(su==-1) {break;}
				System.out.print(su);
			}
			
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
