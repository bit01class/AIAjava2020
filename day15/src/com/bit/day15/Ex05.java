package com.bit.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex05 {

	public static void main(String[] args) {
		//복사완료(x):33,541ms	9,840,497 바이트
		//복사완료(2):17,363ms	9,840,498 바이트
		//복사완료(5):7,016ms	9,840,500 바이트
		//복사완료(64):562ms	9,840,512 바이트
		byte[] buf=new byte[64];
		
		File src=new File("10MG.mp4");//9,840,497 바이트
		File dest=new File("copy\\copy01.mp4");//9,840,498 바이트
		
		InputStream is=null;
		OutputStream os=null;
		
		try {
			System.out.println("복사시작");
			long before=System.currentTimeMillis();
			if(dest.exists()){dest.createNewFile();}
			is=new FileInputStream(src);
			os=new FileOutputStream(dest);
			
			while(true) {
				int su=is.read(buf);
				if(su==-1) {break;}
				os.write(buf);
			}
			long after=System.currentTimeMillis();
			System.out.println("복사완료:"+(after-before)+"ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null){is.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}










