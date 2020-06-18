package com.practice.daily;

public class M {

	public static void main(String[] args) {
		int i=0;
		System.out.println(test(i));//1
		System.out.println(i);//0
	}
	private static int test(int i){
		return ++i;
	}
}
