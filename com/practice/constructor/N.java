package com.practice.constructor;

public class N {

	N() {
		System.out.println("N()");
	}
	static {
		N n1 = new N();
		System.out.println("SIB");
	}
	public static void main(String[] args) {
		System.out.println("------------");
		N n1 = new N();
		System.out.println("----------");
	}
}
/*
N()
SIB
------------
N()
----------*/