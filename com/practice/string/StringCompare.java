package com.practice.string;

public class StringCompare {

	public static void main(String[] args) {
		String str = "Ram";
		String str2= "Ram";
		String str3= "ram";
		String str4 = new String("Ram");
		System.out.println(str==str2);
		System.out.println(str==str3);
		System.out.println(str==str4);
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		System.out.println(str.equals(str4));
		
		int x=0;
		x = x++;
		System.out.println(x);

	}

}
