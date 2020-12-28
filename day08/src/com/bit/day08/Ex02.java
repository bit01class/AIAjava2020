package com.bit.day08;

public class Ex02 {

	public static void main(String[] args) {
		// int -> Integer
		int su1=1234;
		Integer su2=1234;
		Integer su3=new Integer(su1);
		Integer su4=new Integer("1230");
		

		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
		System.out.println(su3==su4);
		System.out.println(su3.equals(su4));
		System.out.println(su3.intValue());
		System.out.println(su3.doubleValue());
		String msg="1223";
		int su5=Integer.parseInt(msg);	//int
		int su6=new Integer(msg);		//Integer
		int su7=Integer.valueOf(msg);	//Integer
		System.out.println(Integer.reverse(-2));
		int su8=16;
		System.out.println("2진수:"+Integer.toBinaryString(su8));
		System.out.println("8진수:"+Integer.toOctalString(su8));
		System.out.println("16진수:"+Integer.toHexString(su8));
		int su9=19111;
		System.out.println(Integer.min(su8, su9));
		System.out.println(Integer.max(su8, su9));
		System.out.println(Integer.sum(su8, su9));
		System.out.println(Integer.compare(su8, su9));
		System.out.println(su3.compareTo(su4));
		
	}

}















