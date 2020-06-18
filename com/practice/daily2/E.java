package com.practice.daily2;

public class E {

	static int x;
	static void test(){
		System.out.println("test:"+x);//test:20
		x=10;
	}
	public static void main(String[] args) {
		System.out.println("main1:"+x);//main1:0
		x=20;
		test();
		System.out.println("main2:"+x);//main2:10
	}
}
