package com.bit.day14;

import java.io.File;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		String path="test03";
		File file=new File(path);
		String[] childs=file.list();
		for(int i=0; i<childs.length; i++) {
			File child=new File(path+"\\"+childs[i]);
			child.delete();
		}
		
		if(file.delete()) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제할 대상이 존재하지 않습니다");
		}
	}

}
