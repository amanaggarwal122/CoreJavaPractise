package com.google.search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P2_GroupWordsThatAreAnagrams {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		String[]  given = new String[]{"eat", "tea", "tan", "ate", "nat", "bat" } ;
		
		Map<String,List<String>> mymap = new LinkedHashMap<>();
		int count = 1;
		
		for(String unique : given)
		{
			char[] charArray = unique.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);
	        System.out.println("My Sorted string looks like : " +sortedStr  ); 
	        
	        
			int i = 0;
			
			if(mymap.containsKey(sortedStr))
			{
				mymap.get(sortedStr).add(unique);	
				
			}
			else
			{
				 List<String> newList = new ArrayList<>();
	                newList.add(unique);
	                mymap.put(sortedStr, newList);
			}
			
		}
		
		System.out.println("");
		System.out.println("HashMap: " + mymap );
		System.out.println("");
		
		// Print the grouped anagrams
        System.out.println("Grouped Anagrams:");
        for (List<String> group : mymap.values()) {
            System.out.println(group);
        }

	}

}
