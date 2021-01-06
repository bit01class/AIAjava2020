package com.bit.day20;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Ex05 {

	public static void main(String[] args) {
		File file=new File("test02.bin");

		OutputStream os=null;
		ObjectOutputStream oos=null;
		try {
			os=new FileOutputStream(file);
			oos=new ObjectOutputStream(os);
			
			Vector vec=new Vector<>();
			vec.add(1111);
			vec.add(3.14);
			vec.add("문자열");
			
			Set list=new HashSet<>(); 
			list.add(1234);
			list.add(1234);
			list.add(3.14);
			list.add("리스트로 작성");
			vec.add(list);
			
			oos.writeObject(vec);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) {oos.close();}
				if(os!=null) {os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
