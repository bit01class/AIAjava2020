package com.bit.day15;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex11 {

	public static void main(String[] args) {
		File file=new File("test03.bin");
		
		InputStream is=null;
		DataInputStream dis=null;
		try {
			is=new FileInputStream(file);
			dis=new DataInputStream(is);
			
			System.out.println(dis.readChar());
			System.out.println(dis.read());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(dis!=null) {dis.close();}
				if(is!=null) {is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}








