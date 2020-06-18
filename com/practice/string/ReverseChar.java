package com.practice.string;

public class ReverseChar {

	public static void main(String[] args) {
		String s = "JAVAJ2EE";
		char[] ch = s.toCharArray();
		for(int i = ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
 	}
}
