package com.google.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestUniqueSubString {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	   String giventext = "abbcabcabc";
	   String giventext2 = "abbcabcabc";
	   HashMap<Character ,Integer> mymap = new HashMap<Character, Integer>();
       Set<Character> uniqueChars = new HashSet<>();
       
       char[] arr = giventext.toCharArray();  // arr[0] = A and arr[1] = b 
       
       for (char ch : arr)
       {
    	    System.out.println("Characters are  : "  + ch);
    	    
    	    
    	}
       System.out.println("Characters length   : "  + arr.length);
       
       int currentcount = 1;
       ArrayList<Character> li = new ArrayList<>(); 
       
       for ( int i = 0 ; i < arr.length; i++ )
       {
       	
       	
       	 
       	if ( mymap.containsKey(arr[i]))
       			{
       		System.out.println(" before clearing map araay is  :  " + arr[i] );
       				mymap.clear();
       				currentcount = 1;
       			}
       	else
       	{
       		System.out.println("In Else loop we added array   :  " + arr[i] );
       		mymap.put(arr[i], currentcount);
       		
       		System.out.println("In Else loop my map value   :  " + mymap.get(arr[i]) );
       		
       		currentcount = currentcount + 1;
       		
       		System.out.println("Size of list  :  " + li.size());
       		
       		if(li.size() < currentcount )
       		{
       		li.add(arr[i]);
       		System.out.println("Added in list .........  :");
       		}
       			
       	}
       	
       	

	}
       System.out.println(" array list countains :  " + li.get(currentcount));

}
}
