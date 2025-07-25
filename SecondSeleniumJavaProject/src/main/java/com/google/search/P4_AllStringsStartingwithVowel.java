package com.google.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4_AllStringsStartingwithVowel {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		List<String> givenwords = Arrays.asList("apple", "banana", "orange", "umbrella", "grape", "Elephant");
		
		char[] vowelArray = new char[]{'a','e','i','o','u'};
		
		List<String> newlist = new ArrayList<>();
		
		for(String givenArray : givenwords)
		{
			char[] charArray = givenArray.toCharArray();
			//String sortedStr = new String(charArray);
			
			//System.out.println("My current array under consideration l "));
			
			for(int i = 0 ; i < vowelArray.length ; i++)
			{
				if(Character.toLowerCase(charArray[0]) == vowelArray[i])
				{
					System.out.println("YES : Given word starts with vowel " +givenArray);
					
					newlist.add(givenArray);
					break;
				}
				
			
		}
			
		}
		
		 System.out.println("Final List:");
	        
	            System.out.println(newlist);

	}

}
