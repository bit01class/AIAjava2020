package com.bit.day14;

import java.io.File;

public class Ex06 {

	public static void main(String[] args) {
		String oldName="target03.txt";
		String newName="target02.txt";

		File oldFile=new File(oldName);
		File newFile=new File(newName);
		if(oldFile.renameTo(newFile)) {
			System.out.println("rename");
		}else {
			System.out.println("fail..");
		}
	}

}
