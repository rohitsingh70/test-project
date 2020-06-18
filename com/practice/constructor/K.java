package com.practice.constructor;

public class K {

	K() {
		this(10);
		System.out.println("K()");
	}
	K(int i) {
		K k1 = new K();
		System.out.println("K()");
	}
	public static void main(String[] args) {
		K obj1 = new K();
		System.out.println("-----------");
		K obj2 = new K();
		System.out.println("-------------");
	}
}

//Exception in thread "main" java.lang.StackOverflowError

