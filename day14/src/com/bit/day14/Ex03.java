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
				System.out.println("�����Ϸ�");
			}else {
				System.out.println("���ϸ� ���� ����");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
