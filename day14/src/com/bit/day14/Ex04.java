package com.bit.day14;

import java.io.File;

public class Ex04 {

	public static void main(String[] args) {
		String path="test05\\etc01";
		File file=new File(path);
		if(file.mkdirs()) {
			System.out.println("디렉토리생성완료");
		}else {
			System.out.println("생성실패");
		}
	}

}
