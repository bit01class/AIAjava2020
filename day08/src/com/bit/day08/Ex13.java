package com.bit.day08;

public class Ex13 {

	public static void main(String[] args) {
		// 다중배열
		int[] arr0;
		arr0=new int[4];
		
		
		int[] arr1=new int[] {1,2,3,4};
		int[] arr2=new int[] {2,3,4};
		int[] arr3=new int[] {3,4,5,6};
		int[][] arr4=new int[][] {arr1,arr2,arr3};
		int[][] arr5=new int[3][4];
		arr5[0]=arr1;
		arr5[1]=arr2;
		arr5[2]=arr3;
		//////////////////////////////////////////
		int[][] arr6=new int[3][];
		for(int i=0; i<arr6.length; i++) {
			System.out.println(arr6[i]);
		}
		int[][] arr7=new int[3][4];
		for(int i=0; i<arr7.length; i++) {
			int[] temp=arr7[i];
			for(int j=0; j<temp.length; j++) {
				System.out.print(temp[j]+" ");
			}
			System.out.println();
		}
		//////////////////////////////////////////
		Integer[] arr8=new Integer[3];
//		for(int i=0; i<arr8.length; i++) {
//			System.out.println(arr8[i]);
//		}
	}

}










