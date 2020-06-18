package com.practice.sib;

public class D {

	static int i;
	static{
		//i=j;//Cannot reference a field before it is defined
	}
	static int j=10;
	public static void main(String[] args) {
		System.out.println("done");
	}
}
