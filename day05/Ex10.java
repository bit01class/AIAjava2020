package com.bit.day05;

class Ex10{

  public static void main(String[] args){
	//배열-정적할당
	// 자료형[] 변수명=new 자료형[배열size];
	// 배열변수명[인덱스]
	// 인덱스 - 0부터시작, 1증가, 연속됨
	// 0 ~ size-1;
	char[] arr1=new char[4];
	arr1[0]='a';
	arr1[1]='b';
	arr1[2]='c';
	arr1[3]='d';
	//char[] arr2=new char[4]{'A','B','C','D'};
	char[] arr2=new char[]{'A','B','C','D'};
	char[] arr3={'!','@','#','$'};
	System.out.println(arr3.length);
	for(int i=0; i<arr3.length; i++){
		System.out.println(arr1[i]);
	}
  }

}





