package com.bit.day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex07 {

	public static void main(String[] args) {
		File file1=new File("10MG.mp4");
		File file2=new File("copy\\copy07.mp4");

		InputStream is=null;
		OutputStream os=null;
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		byte[] buf=new byte[5];
		
		try { 
			long before=System.currentTimeMillis();
			file2.createNewFile();
			is=new FileInputStream(file1);
			bis=new BufferedInputStream(is);
			
			os=new FileOutputStream(file2);
			bos=new BufferedOutputStream(os);
			while(true) {
				int su=bis.read(buf);
				if(su==-1) {break;}
				bos.write(buf,0,su);
			}
			bos.flush();
			long after=System.currentTimeMillis();
			System.out.println("복사완료:"+(after-before)+"ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) {bis.close();}
				if(bos!=null) {bos.close();}
				if(is!=null){is.close();}
				if(os!=null) {os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}












