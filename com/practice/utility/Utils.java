package com.practice.utility;

import java.util.ArrayList;

public class Utils {
	
	public static <T> void executeList(ArrayList<T> value) {
		for(T val : value){
			System.out.println(val);
		}
	}

}
