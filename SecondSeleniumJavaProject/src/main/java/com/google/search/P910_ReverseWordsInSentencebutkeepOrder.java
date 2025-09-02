package com.google.search;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class P910_ReverseWordsInSentencebutkeepOrder {

	public static void main(String[] args) 
	
	{
		// Input:  "hello world this is java"
		//Output: "olleh dlrow siht si avaj"
		
		String input = "hello world this is java";
		
		String[] words = input.split(" ");
		
        Set<String> myset = new LinkedHashSet<>();
        
		for(String word : words)
		{
			StringBuilder result = new StringBuilder();
			char[] charc = word.toCharArray();
			
			for(int i = charc.length-1 ; i >= 0 ; i--)
			{  
				  result.append(charc[i]);	
			}
			
			myset.add(result.toString());	
		}
		
		
		for (String word : myset) 
		{
		    System.out.print(word + " ");
		}

		

	}

}
