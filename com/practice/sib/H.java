package com.practice.sib;

public class H {
	static int i;
	public static void main(String[] args) {
		System.out.println("from main:"+i);
		System.out.println("From main"+H.i);
	}

}
class I {
	public static void main(String[] args) {
		System.out.println("From main :"+ H.i);
	}
}
