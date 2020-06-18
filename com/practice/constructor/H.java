package com.practice.constructor;

public class H {

	H(){
		System.out.println("H()");
	}
	H(int i){
		this();
		System.out.println("H(int)");
	}
	public static void main(String[] args) {
		H h = new H();
		System.out.println("------------");
		H h1 = new H(10);
		System.out.println("--------");
	}
}
