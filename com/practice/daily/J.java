package com.practice.daily;

public class J {

	public static void main(String[] args) {
		int i=20;
		System.out.println("main begins:"+i);
		test(i);
		System.out.println("main ends:"+i);
	}
	static void test(int i){
		System.out.println("test:"+i);
		i=10;
	}
}

//O/P-main begins:20
//test:20
//main ends:20
