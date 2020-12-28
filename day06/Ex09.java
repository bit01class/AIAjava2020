package com.bit.day06;

class Ex09{

  public static void main(String[] args){
	int[] arr1={2,4,6,8};
	int[] arr2=new int[]{2,4,6,8};
	int[] arr3;
	arr3=new int[4];
	arr3[1]=4;
	arr3[2]=6;
	
	for(int i=0; i<arr3.length; i++){
		System.out.println(arr3[i]);
	}
  }

}