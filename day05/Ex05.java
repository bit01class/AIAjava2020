package com.bit.day05;
class Car{
    public final String model;
    public String color;
    public int speed;
    public int max;
    public Car(String a,String b,int c){
	model=a;
	color=b;
	max=c;
    }
    public void speedUp(){speed+=10;}
    public void speedDown(){speed-=10;}
    public void showSpeed(){
	System.out.println(color+"색 내 차 "
	+model+"는 "+speed+"km로 달린다");
    }
}
class Ex05{
    public static void main(String[] args){
	Car myCar=new Car("소나타","쥐",180);
	//myCar.model="K5";
	//myCar.color="흰";
	//myCar.max=200;
	myCar.speedUp();
	myCar.showSpeed();
	myCar.color="검정";
	myCar.speedDown();
	myCar.showSpeed();
    }
}




