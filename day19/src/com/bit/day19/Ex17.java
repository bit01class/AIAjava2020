package com.bit.day19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex17 {

	public static void main(String[] args) {
		File file=new File("text01.txt");

		Reader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			int su=-1;
//			while((su=br.read())!=-1) {
//				System.out.print((char)su);
//			}
			String msg=null;
			while((msg=br.readLine())!=null) {
				System.out.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null) {fr.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
