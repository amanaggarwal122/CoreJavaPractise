package com.google.search;

import java.util.ArrayList;
import java.util.List;

public class Array4_SubSetSum 
{
			
//		Q1. Subset Sum Problem (Recursion + DP)
//		Problem: Given an array of integers, and a sum S, check if there is a subset whose sum equals S.
//		Example: arr = {3, 34, 4, 12, 5, 2}, S = 9 
//		Answer :  4+5=9 and 3+4+2
		
		
		public static void main(String[] args) 
		{
	        int[] arr = {3, 34, 4, 12, 5, 2};
	        int target = 9;

	        List<List<Integer>> result = new ArrayList<>();
	        findSubsets(arr, 0, target, new ArrayList<>(), result);

	        System.out.println("Subsets with sum " + target + " are:");
	        for (List<Integer> subset : result)
	        {
	            System.out.println(subset);
	        }
	    }

	    static void findSubsets(int[] arr, int index, int target, List<Integer> current, List<List<Integer>> result) 
	    {
	    	// ✅ base case
	        if (target == 0) {
	            result.add(new ArrayList<>(current));
	            return;  // found one solution
	        }

	        if (index >= arr.length || target < 0) {
	            return;  // no solution
	        }

	        // ✅ Choice 1: include arr[index]
	        current.add(arr[index]);
	        findSubsets(arr, index + 1, target - arr[index], current, result);

	        // ✅ Choice 2: exclude arr[index] (backtrack)
	        current.remove(current.size() - 1);
	        findSubsets(arr, index + 1, target, current, result);
	    }
	}