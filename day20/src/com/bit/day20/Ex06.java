package com.bit.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class Ex06 {

	public static void main(String[] args) {
		File file = new File("test02.bin");
		
		InputStream is=null;
		ObjectInputStream ois=null;
		
		try {
			is=new FileInputStream(file);
			ois=new ObjectInputStream(is);
			
			Object obj=ois.readObject();
			
			Vector vec=(Vector)obj;
			
			System.out.println(vec.get(0));
			System.out.println(vec.get(1));
			System.out.println(vec.get(2));
			Set list=(Set) vec.get(3);
			Iterator ite = list.iterator();
			while(ite.hasNext()) {
				System.out.println(ite.next());
			}
			
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
