package com.practice.daily;

public class P {

	public static void main(String[] args) {
		int i=0;
		System.out.println(i);
		i=test(i--);
		System.out.println(i);
	}
	static int test(int i){
		System.out.println(i);
		return i--;
	}
}
//0
//0
