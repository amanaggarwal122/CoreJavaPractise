package com.google.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class String1_ReverseString_CheckPalindrome_CountDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Reverse the string : DONE
//		Check if the string is a palindrome.
//		Print the first non-repeating character.
//		Print all duplicate characters (with frequency).
//		Check if the string contains any vowels.
		
		String input = "racecars";
		
		
		//String reverseString ; 
		StringBuilder reverseString = new StringBuilder();
		HashMap<Character , Integer> CharacterCount = new LinkedHashMap<>();
		char[] vowelArray = new char[]{'a','e','i','o','u'};
				
		char[] stringChars = input.toCharArray();
		
		for(int i = input.length()-1 ; i >= 0 ; i--)
		{
			reverseString.append(stringChars[i]);	
		}
		
		System.out.println("Reverse of Given string is : " +reverseString);
		
		String comparision = new String(reverseString);
		
		if(input.equals(comparision))
		{
			System.out.println("Given String is Palindrome   " +input +" : " +reverseString);  
		}
		else
		{
			System.out.println("Given String is NOT Palindrome   " +input +" : " +reverseString);  
		}
			
	
		for(char charc : stringChars)
		{
			if(CharacterCount.containsKey(charc))
			{
				int value = CharacterCount.get(charc);
				value++;
				CharacterCount.put(charc, value);
			}
			else
			{
				CharacterCount.put(charc, 1);
			}
		}
				
		System.out.println("    ");
		System.out.println("Character Count in given string : " +CharacterCount);
		System.out.println("    ");
		
		
		//System.out.println("First Non repeating Character in given string : " +CharacterCount.containsValue(1));
		for(int i = 0 ; i <= input.length()-1 ; i++)
		{
			int value = CharacterCount.get(stringChars[i]);
			if(value == 1 )
			{
				System.out.println("Non repeating character is  : " +stringChars[i] );
			}
			else
				
			{
				System.out.println("this is a  repeating character : " + stringChars[i]);
			}
				
			
		}
		
		for(Map.Entry<Character, Integer> entry : CharacterCount.entrySet())
		{
			if (entry.getValue() > 1) 
			{
				System.out.println("Duplicate character  : ");
		        System.out.println(entry.getKey() + " → " + entry.getValue());
		    }
			
			else if (entry.getValue() == 1) {
                System.out.println("First non-repeating character is :  " + entry.getKey());
                break;
                
            }
			 	
		}
		
		for(char vowel : vowelArray)
		{
			if(CharacterCount.containsKey(vowel))
			{
				System.out.println("Input String have vowel in it   : " +vowel);
				//break;
			}
			else
			{
				System.out.println("Input String DOES NOT have vowel in it");
			}
		}
		
	}

}
