package com.practice.constructor;

public class G {

	G(int i) {
		System.out.println("M(int)");
	}
	public static void main(String[] args) {
		G g = new G(10);
		System.out.println("--------");
		//G g1 = new G();//The constructor G() is undefined
		System.out.println("-------");
	}
}
