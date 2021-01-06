package com.bit.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex12 {

	public static void main(String[] args) {
		// ByteStream - 1byte
		File file=new File("text01.txt");
		InputStream is=null;
		File result=new File("result.txt");
		OutputStream os=null;
		byte[] by=new byte[8];
		try {
			is=new FileInputStream(file);
			os=new FileOutputStream(result);
			int i=0;
			while(true) {
				int su=is.read();
				if(su==-1) {break;}
				by[i++]=(byte)su;
				os.write(su);
			}
			System.out.print(new String(by));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) {os.close();}
				if(is!=null) {is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
