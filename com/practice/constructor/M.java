package com.practice.constructor;

public class M {

	static {
		System.out.println("SIB");
	}
	M() {
		System.out.println("M()");
	}
	public static void main(String[] args) {
		M m1 = new M();
		System.out.println("--------");
		M m2 = new M();
		System.out.println("----------");
	}
}
/*
SIB
M()
--------
M()
----------*/