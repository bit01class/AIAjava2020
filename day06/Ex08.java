package com.bit.day06;

class Ex08{
  public static void func01(int[] arr){
	for(int i=0; i<arr.length; i++){
	   System.out.print(arr[i]+" ");
	}
	System.out.println();
  }
  public static void main(String[] args){
	int[] arr1=new int[]{1,3,5,7,9};
	int[] arr2=new int[]{1,3,5,7,9};
	// 배열의 얕은복사
	int[] arr3=arr1;	
	System.out.println(arr1==arr2);
	System.out.println(arr1.equals(arr2));
	System.out.println(arr1==arr3);
	func01(arr1);
	// 배열의 깊은복사
	int[] arr4=new int[5];
	/*
	for(int i=0; i<arr4.length; i++){
		arr4[i]=arr1[i];
	}
	System.arraycopy(원본,원본어디서부터
		,대상,대상어디서부터,몇개);
	*/
	System.arraycopy(arr1,0,arr4,0,5);

	arr1[0]=0;
	func01(arr4);
	func01(arr1);
  }











}