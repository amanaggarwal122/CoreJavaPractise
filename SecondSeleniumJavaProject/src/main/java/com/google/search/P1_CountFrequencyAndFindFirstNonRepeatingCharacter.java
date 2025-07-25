package com.google.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class P1_CountFrequencyAndFindFirstNonRepeatingCharacter {

	public static void main(String[] args)
	
	{
		
		//String input = "programming";
		String input = "aabbccd";
		
		Map<Character , Integer> uniquemap = new LinkedHashMap<>();
		
		char[] arrays = input.toCharArray();
		int count = 1;
		 		
		for(char array : arrays)
		{
			if(uniquemap.containsKey(array))
			{
				int currentValue = uniquemap.get(array);
				currentValue++;
				uniquemap.put(array, currentValue);
				
			}
			else
			{
				uniquemap.put(array, count);
			}
			
			
		}
		
		
		System.out.println("HashMap: " + uniquemap );
		
		
		
		for (Map.Entry<Character, Integer> entry : uniquemap.entrySet())
		{
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character is: " + entry.getKey());
                break;
                
            }
            else if (entry.getKey() == 'm')
            {
                System.out.println("First  repeating value  is: " + entry.getValue() );
            }
            else
            {
            	System.out.println("No non-repeating character found" );
            	
            }
        }
		
		
		
		
	}

}
