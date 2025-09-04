package com.google.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class String6_WordBreakProblem {

	public static void main(String[] args)
	{
		//Q2. Word Break Problem (DP + Backtracking)
		//Problem: Given a string and a dictionary of words, check if the string can be segmented into valid dictionary words.
		//Example: s = "applepenapple", dict = ["apple", "pen"] → true.
		
		
		String given = "applepenapple";
		
		char[] givenArray = given.toCharArray();
		
		//Set<String> Target = new HashSet<>(Arrays.asList("apple", "pen"));
		List<String> target = Arrays.asList("apple", "pen");
		
		StringBuilder current = new StringBuilder();
        Set<String> result = new TreeSet<>();
       findSubsets(givenArray, 0, target, current, result);
       
System.out.println("Subsets with sum " + target + " are:");
       for (String subset : result)
      {
           System.out.println(subset);
       }
		
	}
	
	 static void findSubsets(char[] arr, int index, List<String>  target,StringBuilder current, Set<String> result) 
	    {
		 
//		// ✅ base case
//		 if((new String(current)).contains(target.get(0)) || (new String(current)).contains(target.get(1)))
//		 {
//			 String currentString = new String(current);
//			 if(currentString.length() == 5 && (currentString.charAt(0) == 'a' && currentString.charAt(4) == 'e') )
//			 {
//				 
//		            result.add(currentString);
//		            return;  // found one solution
//			 }
//			 
//	     }
		 
		// ✅ base case
				 if((new String(current)).length() == 5)
				 {
					 String currentString = new String(current);
					 if(currentString.contains(target.get(0)) )
					 {
						 
				            result.add(currentString);
				            return;  // found one solution
					 }
					 
			     }
				 
				// ✅ base case2
				 if((new String(current)).length() == 3)
				 {
					 String currentString = new String(current);
					 if(currentString.contains(target.get(1)) )
					 {
						 
				            result.add(currentString);
				            return;  // found one solution
					 }
					 
			     }
		 
		 
		 if (index >= arr.length)
		 {
	            return;  // no solution
	        }
		 
		 // ✅ Choice 1: include arr[index]
	        current.append(arr[index]);
	        findSubsets(arr, index + 1, target, current, result);
	        
	        // ✅ Choice 2: exclude arr[index] (backtrack)
	        current.deleteCharAt(current.length() - 1);
	        findSubsets(arr, index + 1, target, current, result);
		 
	    }

	
	    

}
