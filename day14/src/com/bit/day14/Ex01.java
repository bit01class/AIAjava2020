package com.bit.day14;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		// 절대경로
//		String path="D:\\javaWork\\day14\\target01.txt";
		// 상대경로
//		String path=".\\target01.txt";
//		String path="target02.txt";
		String path=".";
//		String path="src";
//		String path="D:\\javaWork\\day01\\..\\day14\\target01.txt";
		System.out.println(path);
		java.io.File file=new File(path);
		System.out.println("존재:"+file.exists());
		System.out.println("디렉토리:"+file.isDirectory());
		System.out.println("파일:"+file.isFile());
		System.out.println("이름:"+file.getName());
		System.out.println("경로:"+file.getPath());
		System.out.println("절대경로:"+file.getAbsolutePath());
		
		try {
			System.out.println("절대경로2:"+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("부모경로:"+file.getParent());
		System.out.println("size:"+file.length()+" bytes");
		System.out.println("최종수정:"+new Date(file.lastModified()));
		
		System.out.println("rwx r읽기권한:"+file.canRead());
		System.out.println("rwx w쓰기권한:"+file.canWrite());
		System.out.println("rwx x실행권한:"+file.canExecute());
		
		if(file.isDirectory()) {
			String[] arr = file.list();
			System.out.println(Arrays.toString(arr));
		}
	}

}










