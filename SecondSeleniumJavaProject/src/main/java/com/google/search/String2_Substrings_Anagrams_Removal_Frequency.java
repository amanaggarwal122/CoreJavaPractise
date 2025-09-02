package com.google.search;

import java.util.LinkedHashSet;
import java.util.Set;

public class String2_Substrings_Anagrams_Removal_Frequency {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
//		         inputStr = "abcbdbca"
//				All substrings of 'abcbdbca':  
//					a ab abc abcb abcbd abc b bc bcb bcb... (etc.)
//					String after removing 'b': acdca
		
		//Find the length of the longest substring with at most k distinct characters.
		
		String inputStr = "abcbdbca";
		Set<String> finalSet = new LinkedHashSet<>();
		
		for(int i = 0 ; i < inputStr.length() ; i++)
		{
			for(int j = i+1 ; j <= inputStr.length() ; j++)
			{
			String subStrings = inputStr.substring(i,j);
			finalSet.add(subStrings);
			}
			
		}
		System.out.println("All substrings of 'abcbdbca':  ");
		System.out.println(finalSet);
		
		
		//Q: Length of longest substring with at most 2 distinct characters: 4
		//String inputStr = "abcbdbca";
		//Q: Length of longest unique substring 
		//BELOW  PART IS INCORRECT 
		
		int right = 0 , left = 0 , currentmaxLength = 0 ,finalmaxLength=0;
		
		char[] charcters = inputStr.toCharArray();
		Set<Character> myset = new LinkedHashSet<>();
		
		for(char character : charcters)
		{
			if(myset.contains(character))
			{
				myset.remove(inputStr.charAt(left));
				left++;
			}
			else
			{
				myset.add(character);
				 
				 
				
			}
			
			if (right - left + 1 > currentmaxLength) 
            {
			 currentmaxLength = right - left + 1;
                String longestSubstr = inputStr.substring(left, right + 1);
                System.out.println("Current longest: [" + longestSubstr + "]");
            }
			//currentmaxLength = right - left + 1 ;
			//finalmaxLength = Math.max(right - left + 1, currentmaxLength);
			
			right++;
			
		}
		
		if(finalmaxLength > currentmaxLength)
			System.out.println(myset);
		
	}
	
	
	

}
