package com.google.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P8_LengthofLongestSubstringWithoutRepeating {

	public static void main(String[] args) 
	{

//		        Input: s = "abcabcbb"
//				Output: 3
//				Explanation: The answer is "abc", with the length of 3.
//
//				Input: s = "bbbbb"
//				Output: 1
//				Explanation: The answer is "b".
//
//				Input: s = "pwwkew"
//				Output: 3
//				Explanation: The answer is "wke"
		
//		     String input = "pwwkew";
//		     
//		     Map<Character , Integer> mymap = new LinkedHashMap<>();
//		     List<Character> myList = new ArrayList<>();
//		     int start = 1;
//		     int end;
//		     int max;
//		     
//		     char[] chararray = input.toCharArray();
//		     
//		     for(char charc : chararray)
//		     {
//		    	 if(!mymap.containsKey(charc))
//		    	 {
//		    		 mymap.put(charc, start);
//		    		 start++;
//		    		 myList.add(charc);
//		    		 max = start;
//		    		 
//		    	 }
//		    	 else
//		    	 {
//		    		 
//		    		 end = start;
//		    	 }
//		     }
//		     
		     
		
		
		String input = "abccbcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of longest unique substring: " + result);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> uniqueChars = new HashSet<>();

        int left = 0, right = 0, maxLength = 0;
        String longestSubstr = "";

        while (right < s.length()) {
            char current = s.charAt(right);

            
            //Debugger
            System.out.println("-----------------");
            System.out.println("Current Character :" +current);
            System.out.println("Current right :" +right);
            System.out.println("Current left :" +left);
            System.out.println("-------------------");
            
            
            // If character already exists, shrink window from left
            while (uniqueChars.contains(current))
            {
                uniqueChars.remove(s.charAt(left));
                System.out.println("Charcter removed from left :" +s.charAt(left));
                System.out.println("************");
                left++;
            }

            // Expand window
            uniqueChars.add(current);
            System.out.println("Charcter Added from right :" +current);
            System.out.println("************");
           // maxLength = Math.max(maxLength, right - left + 1);
            
            if (right - left + 1 > maxLength) 
            {
                maxLength = right - left + 1;
                longestSubstr = s.substring(left, right + 1);
                System.out.println("Current longest: [" + longestSubstr + "]");
            }
            
            right++;
           
        }
        
        System.out.println("#########################");
        System.out.println("Longest substring without repeat: [" + longestSubstr + "]");
        System.out.println("My List cointains  :" +uniqueChars);
        return maxLength;
		
		
		

	}

}
