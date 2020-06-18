package com.practice.daily;

public class K {
	public static void main(String[] args) {
		int i=10;
		test(i);
		System.out.println("main:"+i);//changed value in destination cannot be reflet in main.
	}
	private static void test(int i){
		System.out.println("test:"+i);
		i++;
		System.out.println("test1:"+i);
	}

}

//test:10
//test1:11
//main:10
