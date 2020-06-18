package com.practice.daily;

public class O {

	public static void main(String[] args) {
		int i=0;
		System.out.println(test(i++));
		System.out.println(i);
	}
	static int test(int i){
		return i++;
	}
}
//0
//1
