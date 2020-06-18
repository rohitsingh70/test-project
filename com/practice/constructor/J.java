package com.practice.constructor;

public class J {

	J() {
		System.out.println("J()");
	}
	J(int i) {
		
		J j1 = new J();
		System.out.println("J()");
	}
	public static void main(String[] args) {
		J obj1 = new J();
		System.out.println("----------");
		J obj2 = new J(10);
		System.out.println("-----------");
	}
}

/*O/P

J()
----------
J()
J()
-----------*/
