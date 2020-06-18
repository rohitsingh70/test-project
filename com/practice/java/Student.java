package com.practice.java;

import java.util.ArrayList;
import java.util.Collections;

import com.practice.api.StudentInfo;
import com.practice.utility.Utils;

public class Student {

	public static void main(String[] args) {
		
		//-ve integer, if the current object is lessar than the specified object
		System.out.println("a".compareTo("x"));
		
		//-ve integer
		System.out.println("b".compareTo("d"));
		
		//+ve integer, if the current object is greater than the specified object
		System.out.println("d".compareTo("a"));
		System.out.println("g".compareTo("c"));
		
		System.out.println(new Integer(10).compareTo(100));
		
		//zero , if the current object is equal to specified object
		System.out.println("a".compareTo("a"));
		StudentInfo sInfo = new StudentInfo("Ram",1991,28);
		StudentInfo sInfo1 = new StudentInfo("Laxman",1996,26);
		StudentInfo sInfo2 = new StudentInfo("Raja",1992,227);
		StudentInfo sInfo3 = new StudentInfo("Pratap",1995,224);
		ArrayList<StudentInfo> info = new ArrayList<>();
		info.add(sInfo);
		info.add(sInfo1);
		info.add(sInfo2);
		info.add(sInfo3);
		
		Utils.executeList(info);
		
		Collections.sort(info);
		
		System.out.println("After Sorting");
		
		Utils.executeList(info);

	}

}
