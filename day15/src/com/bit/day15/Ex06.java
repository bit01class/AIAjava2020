package com.bit.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex06 {

	public static void main(String[] args) {
		File src=new File("test01.txt");
		File dest=new File("copy\\copy06.txt");
		InputStream is=null;
		OutputStream os=null;
		byte[] buf=new byte[5];
		try {
			dest.createNewFile();
			is=new FileInputStream(src);
			os=new FileOutputStream(dest);
			
			while(true) {
				int su=is.read(buf,0,3);
				System.out.println(su);
				if(su==-1) {break;}
				os.write(buf,0,su);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null) {is.close();}
				if(os!=null) {os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}









