package com.practice.daily;

public class L {

	public static void main(String[] args) {
		System.out.println("from main");
		test(true,20);
		System.out.println("------");
		boolean f1=false;
		test(f1,30);
	}
	private static void test(boolean flag, int i){
		System.out.println("from test");
		System.out.println(flag);
		System.out.println(i); 
		
	}
}
