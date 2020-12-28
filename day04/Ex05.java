package com.bit.day04;

class Ex05{

  public static void main(String[] args){
    /*
    for(int j=1; j<10; j++){
	for(int i=2; i<10; i++){
	  System.out.print(i+"x"+j+"="+i*j+"  ");
	}
	System.out.println();
    }
    for( int i=1; i<10; i++){
        System.out.println("2x"+i+"="+2*i+" 3x"+i+"="+3*i);
    }
    */

    int dan=2;
    int su=1;
    boolean boo=true;
    while(boo){
	System.out.print(dan+"x"+su+"="+dan*su+"\t");
	if(dan==9&&su==9){
	   boo=false;
	}else if(dan==9){
	   System.out.println();
	   dan=1;
	   su++;
	}
    dan++;
    }
  }
}








