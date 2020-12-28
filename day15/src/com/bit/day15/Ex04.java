package com.bit.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex04 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		OutputStream os=null;
		String msg="abcd\nABCD\nefg\nEfg";
		byte[] by=msg.getBytes();
		try {
			os=new FileOutputStream(file);
			
			os.write(by);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
