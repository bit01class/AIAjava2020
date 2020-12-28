package com.bit.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Ex12 {

	public static void main(String[] args) {
		File file=new File("target04.bin");
		String msg=null;
//		byte[] by=new byte[(int) file.length()];
		ArrayList<Byte> list=new ArrayList<>();
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream(file);
//			for(int i=0; i<by.length; i++) {
//				int su=fis.read();
//				System.out.println(su);
//				by[i]=(byte)(su);
//			}
			while(true) {
				int su=fis.read();
				if(su==-1) {break;}
				list.add((byte)su);
			}
			Object[] arr1 = list.toArray();
			byte[] arr2=new byte[arr1.length];
			for(int i=0; i<arr1.length; i++) {
				arr2[i]=(Byte)arr1[i];
			}
			msg=new String(arr2);
			System.out.println(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(fis!=null){fis.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}










