package com.google.search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P913_GroupWordsThatAreAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "listen silent enlist google inlets banana";
		
		//OUTPUT :
		//{eilnst=[listen, silent, enlist, inlets], eggloo=[google], aaabnn=[banana]}
		
		HashMap<String , List<String>> mymap = new HashMap<>();
		List<String> myList = new ArrayList<>();
		
		String[] words = input.split(" ");
		
		for(String word : words)
		{
			char[] array = word.toCharArray();
			
			Arrays.sort(array);
			
			//String sortedWord = array.toString();
			//Above line is wrong method to convert array to string 
			
			String sortedWord = new String(array);
			System.out.println("Sorted Words  : "  +sortedWord);
			
			if(mymap.containsKey(sortedWord))
			{
				List<String> myValue = mymap.get(sortedWord);
				myValue.add(word);
				mymap.put(sortedWord, myValue);
				
				
			}
			else
			{
				List<String> myValue = new ArrayList<>();
				myValue.add(word);
				mymap.put(sortedWord, myValue);
			}
		}
		
		
		System.out.println("Result : "  +mymap);		
	}

}
