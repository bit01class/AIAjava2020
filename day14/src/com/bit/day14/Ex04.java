package com.bit.day14;

import java.io.File;

public class Ex04 {

	public static void main(String[] args) {
		String path="test05\\etc01";
		File file=new File(path);
		if(file.mkdirs()) {
			System.out.println("���丮�����Ϸ�");
		}else {
			System.out.println("��������");
		}
	}

}
