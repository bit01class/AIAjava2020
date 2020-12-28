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
		//����Ϸ�(x):33,541ms	9,840,497 ����Ʈ
		//����Ϸ�(2):17,363ms	9,840,498 ����Ʈ
		//����Ϸ�(5):7,016ms	9,840,500 ����Ʈ
		//����Ϸ�(64):562ms	9,840,512 ����Ʈ
		byte[] buf=new byte[64];
		
		File src=new File("10MG.mp4");//9,840,497 ����Ʈ
		File dest=new File("copy\\copy01.mp4");//9,840,498 ����Ʈ
		
		InputStream is=null;
		OutputStream os=null;
		
		try {
			System.out.println("�������");
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
			System.out.println("����Ϸ�:"+(after-before)+"ms");
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










