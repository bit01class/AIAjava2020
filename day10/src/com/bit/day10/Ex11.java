package com.bit.day10;

import java.util.Random;

public class Ex11 {
public static void main(String[] args) {
	// 0<= Math.random()  <1 
	
	java.util.Random ran=new Random();
	System.out.println(ran.nextBoolean());
	System.out.println(ran.nextInt());
	System.out.println(ran.nextInt(3));
	System.out.println(ran.nextInt(3));
}
}
