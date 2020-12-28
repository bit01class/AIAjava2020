package com.bit.day14;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		File file=new File("test01");
//		File parant=new File(file.getParent());
//		parant.mkdirs();
			try {
			if(file.createNewFile()) {
				System.out.println("생성완료");
			}else {
				System.out.println("동일명 파일 존재");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
