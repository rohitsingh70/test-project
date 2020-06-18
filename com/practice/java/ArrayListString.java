package com.practice.java;

import java.util.ArrayList;
import java.util.Collections;

import com.practice.utility.Utils;

public class ArrayListString {

	public static void main(String[] args) {

		ArrayList<String> string = new ArrayList<>();
		string.add("Ram");
		string.add("om");
		string.add("avi");
		string.add("Azad");
		string.add("Raj");

		System.out.println(string);

		Utils.executeList(string);

		Collections.sort(string);

		System.out.println("After Sorting....");

		Utils.executeList(string);

	}	

}
