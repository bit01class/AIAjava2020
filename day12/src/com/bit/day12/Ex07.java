package com.bit.day12;

import java.util.Enumeration;
import java.util.Vector;

public class Ex07 {

	public static void main(String[] args) {
		Vector vec1=new Vector();
		vec1.addElement("ù��°");
		vec1.addElement("�ι�°");
		vec1.addElement("����°");
		vec1.addElement("�׹�°");

		System.out.println(vec1.elementAt(0));
		System.out.println(vec1.elementAt(1));
		System.out.println(vec1.elementAt(2));
		System.out.println(vec1.elementAt(3));
		System.out.println("-------------------------");
		Enumeration eles = vec1.elements();
		while(eles.hasMoreElements()) {
		System.out.println(eles.nextElement());
		}
	}

}











