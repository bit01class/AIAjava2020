package com.bit.day10;

import java.util.Random;

class Ball01{
	final int num;
	String color;
	
	public Ball01(int num) {
		this.num=num;
		if(num<11) {
			color="³ë¶û";
		}else if(num<21){
			color="ÆÄ¶û";
		}else if(num<31) {
			color="»¡°­";
		}else if(num<41) {
			color="°ËÁ¤";
		}else {
			color="¿¬µÎ";
		}
	}
}

public class Ex17 {

	public static void main(String[] args) {
		Ball01[] lotto;
		lotto= new Ball01[45];
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=new Ball01(i+1);
		}
		// mix
		Random random=new Random();
		Ball01 temp;
		for(int i=0; i<100000; i++) {
			int ran=random.nextInt(44)+1;
			temp=lotto[0];
			lotto[0]=lotto[ran];
			lotto[ran]=temp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.println(i+1+"¹øÂ° °øÀº "
		+lotto[i].color+"»ö "+lotto[i].num+"¹ø");
		}
	}

}
