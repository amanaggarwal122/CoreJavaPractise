package com.google.search;

import java.util.HashMap;

public class P6_MostFrequentWordInGivenString 
{

	public static void main(String[] args)
	{
		String given = "The quick brown fox jumps over the lazy dog. The dog was not amused";
		
		//Most frequent word: the
		//Frequency: 3
		//
		
		
		String[] allwords = given.split(" ");
		for(String word : allwords)
		{
		System.out.println("Words are : " + word.toLowerCase());
		}
		
		HashMap<String, Integer> mymap = new HashMap<>();
		
		for(String word : allwords)
		{
			if(mymap.containsKey(word.toLowerCase()))
			{
				int value = mymap.get(word.toLowerCase());
				value++;
				mymap.put(word.toLowerCase(), value);
			}
			else
			{
				
				mymap.put(word.toLowerCase(),1);
			
			}
		}
		
		System.out.println("Words with count : " + mymap );
		
	}
	
	
	
}
