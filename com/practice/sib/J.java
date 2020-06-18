package com.practice.sib;

public class J {
	
	static int i = 10;
	static{
		System.out.println("I-SIB");
	}
}
class K {
	
	static {
		System.out.println("K-SIB");
	}
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println(J.i);
		System.out.println("K-main-end");
	}
}
