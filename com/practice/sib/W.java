package com.practice.sib;

public class W {

	int i;
	static W test(){
		W w1 = new W();
		return w1;
	}
	public static void main(String[] args) {
		W obj = test();
		System.out.println(obj.i);
	}
}
