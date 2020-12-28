package com.bit.day08;

public class Ex05 {

	public static void main(String[] args) {
		double su1=129.14;
		Double su2=3.14;
		Double su3=new Double(su1);
		Double su4=new Double("3.14");

		System.out.println(su3);
		System.out.println(su4);
		byte su5=su3.byteValue();
		System.out.println(su5);
		double su6=Double.parseDouble("3.14");
		System.out.println(su6);
		System.out.println("16Áø¼ö:"+Double.toHexString(3.14));
		
		// 
		
		//int su7=1/0;
		double su8=0.0/0.0;
		//System.out.println(su7);
		System.out.println(su8);
		System.out.println(Double.isInfinite(su8));
		System.out.println(Double.isNaN(su8));
	}

}










