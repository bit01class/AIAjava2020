package com.bit.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		InputStream inn;//=System.in;
		
		String test="ABCD\nEFG\n1235\n";
		
		try {
			inn=new FileInputStream(file);
			java.util.Scanner sc;
			sc=new Scanner(test);
			String msg=sc.nextLine();
			System.out.println(msg);
			msg=sc.nextLine();
			System.out.println(msg);
			msg=sc.nextLine();
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
