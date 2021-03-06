package com.bit.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Ex08 {

	public static void main(String[] args) {
		File file=new File("test03.bin");
		
		InputStream is=null;
		ObjectInputStream ois=null;
		
		try {
			is=new FileInputStream(file);
			ois=new ObjectInputStream(is);
			
			Object obj=ois.readObject();
			Node node=(Node) obj;
			System.out.println(node.val1);
			System.out.println(node.get2());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null) {ois.close();}
				if(is!=null) {is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
