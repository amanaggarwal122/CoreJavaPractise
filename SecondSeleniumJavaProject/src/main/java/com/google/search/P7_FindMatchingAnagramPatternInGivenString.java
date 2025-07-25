package com.google.search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P7_FindMatchingAnagramPatternInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String givenText = "cbaebabacd", givenPattern = "abc";
		List<String> subListOfThree = new ArrayList<>();
		List<String> sortedListOfThree = new ArrayList<>();
		
		        //Output:
				//[0, 6]
				//Explanation:
				//- Substring `"cba"` at index 0 is an anagram of `"abc"`
				//- Substring `"bac"` at index 6 is an anagram of `"abc"
		
		for(int i = 0 ; i< givenText.length() -2 ; i++)
		{
		
		
		subListOfThree.add(givenText.substring(i, i+3));
		
		}
		
		System.out.println("My List of sub string is : " +subListOfThree);
		
		for(String substring : subListOfThree)
		{
			char[] charArray = substring.toCharArray();
			 Arrays.sort(charArray);
			 String sortedString = new String(charArray);
			 
			 if(sortedString.equals(givenPattern))
			 {
				 System.out.println("we got following matching anagram : " +substring);
			 }
			 
			// sortedListOfThree.add(sortedString);
		}
		
			

	}

}
