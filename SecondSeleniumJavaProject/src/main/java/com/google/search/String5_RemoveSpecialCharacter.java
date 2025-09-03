package com.google.search;

public class String5_RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem C – Remove Special Characters
//		Q: Write a Java function to remove all special characters from a string, keeping only alphabets.
//		Input: "He@llo! W#or1ld"  
//		Output: "HelloWorld"
		
		
		String input = "He@llo! W#or1ld";
		StringBuilder builder = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for( int i = 0 ; i < input.length() ; i++ )
		{
			if( charArray[i] > 64 && charArray[i] < 116)
			{
				builder.append(charArray[i]);
			}
		}
		
		System.out.println(builder);

	}

}
