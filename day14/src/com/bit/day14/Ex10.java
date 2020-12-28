package com.bit.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex10 {

	public static void main(String[] args) {
		File srcFile=new File("target03.txt");
		File tarFile=new File("test01\\copy2");
		
		InputStream is;
		OutputStream os;
		
		try {
			tarFile.createNewFile();
			is=new FileInputStream(srcFile);
			os=new FileOutputStream(tarFile);
			while(true) {
				int su=is.read();
				if(su==-1) {break;}
				os.write(su);
			}
			is.close();
			os.close();
			System.out.println("복사완료");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
