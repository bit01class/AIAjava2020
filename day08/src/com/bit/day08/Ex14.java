package com.bit.day08;

public class Ex14 {

	public static void main(String[] args) {
//		int[][] arr1=new int[3][5];
		int[][] arr1=new int[][] {
								{1,2,3},{1,2,3,4,5},{1,2}
								};
//		arr1[1][2]=1;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}

	}

}
