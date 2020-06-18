package com.practice.java;

import java.util.ArrayList;
import java.util.Collections;

import com.practice.utility.Utils;

public class ArrayListInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(2);
		array.add(8);
		array.add(0);
		array.add(5);
		array.add(1);
		
		Utils.executeList(array);
		
		Collections.sort(array);
		
		System.out.println("After Sorting....");
		
		Utils.executeList(array);

	}

}
