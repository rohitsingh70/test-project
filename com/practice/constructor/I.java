package com.practice.constructor;

public class I {

	I() {
		System.out.println("S()");
	}
	I(int i) {
		//I();//We cannot call one constructor with other constructor with their name
		System.out.println("S(int)");
	}
	public static void main(String[] args) {
		I obj1 = new I();
		System.out.println("-----------");
		I obj2 = new I(10);
		System.out.println("--------");
	}
}
