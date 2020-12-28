package com.bit.day05;

class Ex01{
  public static int speed;

  public static void speedUp(){
	if(speed>200-13){
	speed=200;
	}else{
	speed+=13;
	}
  }
  public static void speedDown(){
	if(speed>=0+11){
	speed-=11;
	}else{
	speed=0;
	}
  }
  public static void main(String[] args){
    System.out.println("내차의 현재속도 :"+speed+"km");
    for(int i=0; i<50; i++){    
    speedUp();
    System.out.println("내차의 현재속도 :"+speed+"km");
    }
    for(int i=0; i<50; i++){
    speedDown();
    System.out.println("내차의 현재속도 :"+speed+"km");
    }
  }

}