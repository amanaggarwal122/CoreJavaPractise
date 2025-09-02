package com.google.search;

public class String3_ReverseStringKeepingSpecialCharactwerPosition {

	public static void main(String[] args) {
		// Problem 4: Reverse a String (Keep Special Characters in Place)
        // Q: Reverse only the letters in a string, keeping special characters in the same position.
        // Input: "a,b$c"
        // Output: "c,b$a"
		
		String given = "a,b$c" ;
		
		char[] charArray = given.toCharArray();
		StringBuilder build = new StringBuilder(); 
		int n = given.length();
		System.out.println( "CString Length  : " +n);
		for(int i = given.length()-1 ; i >= 0 ; i-- )
		{
			int asciivalue = charArray[i];
			System.out.println( "Current Ascii value and charactert : " +charArray[i] +" and " +asciivalue);
			if( asciivalue > 64)
			{
				
				build.append(charArray[i]);
				System.out.println( "Character added in list : " +charArray[i]);
				
			}
			if(asciivalue < 64) 
			{
				build.append(charArray[given.length()- i-1]);
				System.out.println( "Special Character Added" +charArray[given.length()- i-1]);
			}
			
		}
		
		String finalString = new String(build);
		System.out.println( "Final  String : " +finalString);
		
	}

}
