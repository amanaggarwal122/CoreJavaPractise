package com.google.search;

public class String4_FindMiddleElement {

	public static void main(String[] args) {
		// Q: Write a Java program to find the middle character(s) of a string.

//		If length is odd → return 1 middle char
//		If length is even → return 2 middle chars
//		Example:
//		Input: "abcdef" → Output: "cd"  
//		Input: "abcde"  → Output: "c"
		
		
		String given = "abcdef";
		
		char[] charArray = given.toCharArray();
		
		int n = given.length();
		int Middle = n/2 ;
		
		if(n%2 > 0)
		{
			
			
			System.out.println("Given String is Odd and Middle Character is : " +charArray[Middle]);
		}
		else
		{
			System.out.println("Given String is EVEN  and Middle Character ARE : " +charArray[Middle-1] +" and " +charArray[Middle]);
		}

	}

}
