package com.practice.iib;

public class E {

	{
		System.out.println("IIB");
	}
	static {
		
		System.out.println("SIB");
	}
	public static void main(String[] args) {
		E e = new E();
		System.out.println("main");
	}
}
/*
SIB
IIB
main*/