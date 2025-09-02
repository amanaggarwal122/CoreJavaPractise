package com.google.search;

import java.util.LinkedHashMap;
import java.util.Map;

public class P911_FrequencyCountCompression {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//Input:  "aaabbcddddee"
		//Output: "a3b2c1d4e2"
			
		String input = "aaabbcddddee";
		
		char[] givenCharcters = input.toCharArray();
		
		Map<Character,Integer> mymap = new LinkedHashMap<>();
		
		for(char charc : givenCharcters)
		{
			if(mymap.containsKey(charc))
			{
				int value = mymap.get(charc) ;
				value++;
				
				mymap.put(charc, value);
				
			}
			else
			{
				mymap.put(charc, 1);
			}
		}
		
	    System.out.print("string with frequnecy  : ");
		
		for (Map.Entry<Character, Integer> entry : mymap.entrySet())
		{
			
                System.out.print("" +entry.getKey()  +entry.getValue());
            
         }

	}

}
