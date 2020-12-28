/*
Q1. "ABCD" -> "abcd"

Q2. 주번번호 체크기
       java com.bit.day06.Ex06 200101-4234567
       당신은 1살 여성입니다
       
       java com.bit.day06.Ex06 990101-1234567
       당신은 22살 남성입니다
*/
package com.bit.day06;

class Ex06{

  public static void main(String[] args){
	System.out.println("Q1.다음을 소문자로만 출력하시오");
	String st1="ABCD";
	
	char[] ch1=st1.toCharArray();
	for(int i=0; i<ch1.length; i++){
	ch1[i]=(char)(ch1[i]+('a'-'A'));	// 97=65+x;
				// 97-65=x;
	}		

	String st2=new String(ch1);
	System.out.println(st2);

  }

}











