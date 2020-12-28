package com.bit.day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) {
		InputStream myIn=System.in;
		OutputStream myOut=System.out;
		try {
			int su=myIn.read();
			System.out.println(su);
			su=myIn.read();
			System.out.println(su);
			su=myIn.read();
			System.out.println(su);
			su=myIn.read();
			System.out.println(su);
			System.out.println("³¡");
//			myOut.write(65);
//			myOut.write(66);
//			myOut.write(67);
//			myOut.flush();
//			myOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
