package com.bit.day15;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex09 {

	public static void main(String[] args) {
		String msg="이중필터 장착";
		File file=new File("test02.txt");
		
		OutputStream os=null;
		BufferedOutputStream bos=null;
		PrintStream ps=null;

		try {
			os=new FileOutputStream(file);
			ps=new PrintStream(os);
			bos=new BufferedOutputStream(ps);
			bos.write(msg.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null) {bos.close();}
				if(ps!=null) {ps.close();}
				if(os!=null) {os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









