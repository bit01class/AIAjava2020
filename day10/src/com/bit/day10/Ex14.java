package com.bit.day10;

import java.util.Random;

public class Ex14 {

	public static void main(String[] args) {
		// ��
		// �ڡ�
		// �ڡڡ�
		// �ڡڡڡ�
		Random random=new Random();
		int[] lotto=new int[6];
		
		for(int i=0; i<6; i++) {
			int su=random.nextInt(45)+1;
			boolean boo=true;
			for(int j=0; j<i; j++) {
//				System.out.print("��");
				if(su==lotto[j]) {
					i--;
					boo=false;
				}
			}
//			System.out.println();
			if(boo) {lotto[i]=su;}
		}

	}

}








