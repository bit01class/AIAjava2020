package com.bit.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex08 {

	public static void main(String[] args) {
		System.out.write(97);
		System.out.flush();
		File file=new File("test02.txt");
		
		OutputStream os=null;
		
		PrintStream ps=null;
		
		try {
			if(file.exists()) {file.createNewFile();}
			os=new FileOutputStream(file);
			ps=new PrintStream(os);
			
//			ps.write();
			ps.print("개행없이 작성");
			ps.print("개행없이 작성\n");
			ps.println("출력하고 개행");
			ps.println("또한줄 작성");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null) {ps.close();}
				if(os!=null) {os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}








