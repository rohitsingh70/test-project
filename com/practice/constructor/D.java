package com.practice.constructor;

public class D {

	int i;
	D(int k){
		i=10;
		System.out.println("D()");
	}
	public static void main(String[] args) {
		//D d = new D();Compile time exception
		//System.out.println(d.i);
	}
}
