package com.practice.iib;

public class D {

	{
		System.out.println("IIB");
	}
	D(int i) {
		System.out.println("D(int)");
	}
	public static void main(String[] args) {
		D d1 = new D(20);
		System.out.println("-----------");
		D d2 = new D(10);
		System.out.println("-------------");
	}
	{
		System.out.println("D-IIB");
	}
}
/*
IIB
D-IIB
D(int)
-----------
IIB
D-IIB
D(int)
-------------*/