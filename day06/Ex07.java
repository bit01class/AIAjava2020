/*
주번번호 체크기
       java com.bit.day06.Ex06 200101-4234567
       당신은 1살 여성입니다
*/

package com.bit.day06;
class Ex07{

  public static void main(String[] args){
	String msg=args[0];//"200101-4234567";
	char[] arr1=msg.toCharArray();
	int age=0;
	char gender='남';

	int su=(arr1[0]-'0')*10+(arr1[1]-'0');
	
	// 나이 2020-2019+1

	if(arr1[7]=='1'||arr1[7]=='2'){
	    age=2020-(1900+su)+1;
	}else if(arr1[7]=='3'||arr1[7]=='4'){
	    age=2020-(2000+su)+1;
	}

	if(arr1[7]=='1' || arr1[7]=='3'){
	    gender='남';
	}else if(arr1[7]=='2'||arr1[7]=='4'){
	    gender='여';
	}

	System.out.println("당신은 "+age+"세 "
	+gender+"성입니다");
	
  }

}




