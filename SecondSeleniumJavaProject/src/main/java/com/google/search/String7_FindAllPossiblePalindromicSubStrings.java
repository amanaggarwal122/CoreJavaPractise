package com.google.search;

import java.util.ArrayList;
import java.util.List;

public class String7_FindAllPossiblePalindromicSubStrings {

	public static void main(String[] args) 
	{
		
//		Write a Java program that takes a string as input and finds all distinct palindromic substrings present in it.
//		Example Input: "ababa"
//		Expected Output: { "a", "b", "aba", "bab", "ababa" }
		
		String input = "ababa";
		String CurrentString;
		
		//char[] inputArray = input.toCharArray();
		
		List<String> DistinctWords = new ArrayList<>();
		
		for( int i = 1 ; i< input.length() ; i++)
		{
			CurrentString = input.substring(0,i);
			DistinctWords.add(CurrentString);
			
		}
		
		System.out.println("All sub strings : " +DistinctWords);
		
		for( int i = 0 ; i< DistinctWords.size() ; i++)
		{
			System.out.println("Lets find out if : " +DistinctWords.get(i) +" is palindrome or not ");
		reverseString(DistinctWords.get(i));
		}
		
		

	}
	
	public static String reverseString(String given)
	{
		StringBuilder build = new StringBuilder();
		char[] givenArray = given.toCharArray();
		
		for(int i =  given.length()-1 ; i >= 0 ; i--)
		{
			build.append(givenArray[i]);
		}
		
		String reverseString = new String(build);
		System.out.println("My reverse string is : "  +reverseString );
		if(given.equals(reverseString) )
		{
			System.out.println("Given String is palindrome : "  +reverseString );
			return reverseString;
		}
		else
		{
			System.out.println(reverseString +" :  is NOT palindrome : "   );
			return null;
		}
		
	}

}
