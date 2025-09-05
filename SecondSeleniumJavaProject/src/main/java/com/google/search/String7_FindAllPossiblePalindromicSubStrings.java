package com.google.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class String7_FindAllPossiblePalindromicSubStrings {

	public static void main(String[] args) 
	{
		
//		Write a Java program that takes a string as input and finds all distinct palindromic substrings present in it.
//		Example Input: "ababa"
//		Expected Output: { "a", "b", "aba", "bab", "ababa" }
		
		String input = "ababa";
		String CurrentString;
		
		//18001024488 - care
		//Priyanka
		//88121830
		
		//char[] inputArray = input.toCharArray();
		
		//hash Set stores only distinc values
		Set<String> DistinctWords = new HashSet<>();
		
		for( int i = 0 ; i< input.length() ; i++)
		{
			for(int j = i+1 ; j <= input.length() ; j++)
			{
			CurrentString = input.substring(i,j);
			DistinctWords.add(CurrentString);
			}
			
		}
		
		System.out.println("All sub strings : " +DistinctWords);
		
		List<String> DistinctWordsList = new ArrayList<>(DistinctWords);
		
		for( int i = 0 ; i< DistinctWords.size() ; i++)
		{
			//System.out.println("Lets find out if : " +DistinctWordsList.get(i) +" is palindrome or not ");
			reverseString(DistinctWordsList.get(i));
		}
		
		

	}
	
	public static void reverseString(String given)
	{
		StringBuilder build = new StringBuilder();
		List<String> finalPalindrome = new ArrayList<>();
		char[] givenArray = given.toCharArray();
		
		for(int i =  given.length()-1 ; i >= 0 ; i--)
		{
			build.append(givenArray[i]);
		}
		
		String reverseString = new String(build);
		//System.out.println("My reverse string is : "  +reverseString );
		
		if(given.equals(reverseString) )
		{
			//System.out.println("Given String is palindrome : "  +reverseString );
			finalPalindrome.add(reverseString);
			//return reverseString;
			//System.out.println("All sub Strings that are Palindrome : " +reverseString );
		}
			
		int len = 0;
		int Length;
		for( int i = 0 ; i< finalPalindrome.size() ; i++)
		{
			System.out.println("Following words are Palindrome : " +finalPalindrome.get(i) );
			Length = finalPalindrome.get(i).length();
			
				
		}
		
	}

}
