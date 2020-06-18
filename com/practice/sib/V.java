package com.practice.sib;

public class V {

	int i;
	static void test(V obj){
		obj.i = 20;
	}
	public static void main(String[] args) {
		V v = new V();
		v.i=10;
		System.out.println("A:"+v.i);
		test(v);
		System.out.println("B:"+v.i);
		
	}
}

