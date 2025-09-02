package com.google.search;

import java.util.LinkedHashSet;
import java.util.Set;

public class P9_RemoveDuplicateAndPreserveOriginalOrder {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		    Input:
//			"this is a test this is only a test"
//
//			Output:
//			"this is a test only"
		
		
		String input = "this is a test this is only a test";
		String[] mystring = input.split(" ");
		
		Set<String> myset = new LinkedHashSet<>();
		
		for(int i = 0 ; i < mystring.length ; i++)
		{
			myset.add(mystring[i]);
		}
		
		System.out.println(myset);
		
		
		for (String word : myset) {
		    System.out.println(word + " ");
		}

	}

}
