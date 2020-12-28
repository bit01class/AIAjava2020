package com.bit.day14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		String msg="문자열 작성";
		byte[] by=msg.getBytes();
		File file=new File("target04.bin");
		FileOutputStream fos=null;
		try {
			file.createNewFile();
			fos=new FileOutputStream(file);
			for(int i=0; i<by.length; i++) {
				fos.write(by[i]);
			}
			System.out.println("작성완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) {fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}

	}

}





