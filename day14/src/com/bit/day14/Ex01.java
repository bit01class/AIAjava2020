package com.bit.day14;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		// ������
//		String path="D:\\javaWork\\day14\\target01.txt";
		// �����
//		String path=".\\target01.txt";
//		String path="target02.txt";
		String path=".";
//		String path="src";
//		String path="D:\\javaWork\\day01\\..\\day14\\target01.txt";
		System.out.println(path);
		java.io.File file=new File(path);
		System.out.println("����:"+file.exists());
		System.out.println("���丮:"+file.isDirectory());
		System.out.println("����:"+file.isFile());
		System.out.println("�̸�:"+file.getName());
		System.out.println("���:"+file.getPath());
		System.out.println("������:"+file.getAbsolutePath());
		
		try {
			System.out.println("������2:"+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�θ���:"+file.getParent());
		System.out.println("size:"+file.length()+" bytes");
		System.out.println("��������:"+new Date(file.lastModified()));
		
		System.out.println("rwx r�б����:"+file.canRead());
		System.out.println("rwx w�������:"+file.canWrite());
		System.out.println("rwx x�������:"+file.canExecute());
		
		if(file.isDirectory()) {
			String[] arr = file.list();
			System.out.println(Arrays.toString(arr));
		}
	}

}










