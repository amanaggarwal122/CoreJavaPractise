package com.google.search;

import java.util.ArrayList;
import java.util.List;

public class Array4_SubSetSum_trueOrFalse {

	public static void main(String[] args) 
	{
		//Q1. Subset Sum Problem (Recursion + DP)
//		Problem: Given an array of integers, and a sum S, check if there is a subset whose sum equals S.
//		Example: arr = {3, 34, 4, 12, 5, 2}, S = 9 
//		Answer :  4+5=9 and 3+4+2
		
		
		int[] givenArray = {3, 34, 4, 12, 5, 2};
		int target = 9;
		int currentSum = 0;
		int CurrentIndex = 0; 
		
		List<Integer> CurrentSet = new ArrayList<>();
		List<List<Integer>> resultSubset = new ArrayList<>();
		
		recursiveFunction2(givenArray,CurrentIndex,target,CurrentSet,resultSubset);
		
		 System.out.println("Subsets with sum " + target + " are:");
	        for (List<Integer> subset : resultSubset)
	        {
	            System.out.println(subset);
	        }
	}
	
	public static void recursiveFunction(int[] arr ,int IntialIndex, int SumTarget , List<Integer> sumSet ,List<List<Integer>>  resultSubset)
	{
		
		//
		if(SumTarget == 0)
		{
			System.out.println("My subsetsum for if condition :" +sumSet);
			resultSubset.add(new ArrayList<>(sumSet));
			System.out.println("TRUE");
			return;
		}
		
		 if (IntialIndex >= arr.length || SumTarget < 0) {
	            return;  // no solution
	        }

		//Include Condition
		sumSet.add(arr[IntialIndex]);
		recursiveFunction(arr ,IntialIndex + 1 , SumTarget - arr[IntialIndex] ,sumSet,resultSubset );
		
		
		//Exclude Condition
		sumSet.remove(sumSet.size() -1);
		recursiveFunction(arr ,IntialIndex + 1,SumTarget ,sumSet,resultSubset );
		
		
		
	}
	
	public static void recursiveFunction2(int[] arr ,int IntialIndex, int SumTarget , 
            List<Integer> sumSet ,List<List<Integer>> resultSubset)
{
    // Base case: if target sum is reached
    if(SumTarget == 0)
    {
        System.out.println("✅ Found subset: " + sumSet);
        resultSubset.add(new ArrayList<>(sumSet)); // store a copy
        return; // stop exploring further
    }

    // Base case: index out of bounds OR negative sum
    if (IntialIndex >= arr.length || SumTarget < 0) 
    {
        System.out.println("⛔ Dead end at index: " + IntialIndex + " with sumSet: " + sumSet + " with Current SUM: " + SumTarget  );
        return;  // no solution from here
    }

    // ------------------ INCLUDE STEP ------------------
    System.out.println("➡️ INCLUDE " + arr[IntialIndex] + " at index " + IntialIndex);
    sumSet.add(arr[IntialIndex]); // include current element
    System.out.println("   sumSet after include: " + sumSet);

    recursiveFunction2(arr ,IntialIndex + 1 , SumTarget - arr[IntialIndex] , sumSet, resultSubset );
    System.out.println("⬅️ Returning from INCLUDE of " + arr[IntialIndex] + " | sumSet before backtrack: " + sumSet);

    // ------------------ BACKTRACK (remove) ------------------
    sumSet.remove(sumSet.size() - 1); // backtrack
    System.out.println("🔙 Removed " + arr[IntialIndex] + " | sumSet after backtrack: " + sumSet);

    // ------------------ EXCLUDE STEP ------------------
    System.out.println("➡️ EXCLUDE " + arr[IntialIndex] + " at index " + IntialIndex);
    recursiveFunction2(arr ,IntialIndex + 1, SumTarget , sumSet, resultSubset );

    // ------------------ STATE OF RESULT SUBSET ------------------
    System.out.println("📊 Result subsets so far: " + resultSubset);
}
	
	
	private static void backtrack(int[] arr, int target, int index, int currentSum, List<Integer> currentSubset, List<List<Integer>> result) 
	{ 
		// BASE CASE: We've considered all elements in the array if (index == arr.length)
		 // Check if our current subset's sum equals the target if (currentSum == target)
			 // Create a copy of currentSubset and add it to results
				// We need to create a copy because currentSubset will be modified later result.add(new ArrayList<>(currentSubset)); } 
				// Return from this recursive call (base case reached) return; } // RECURSIVE CASE: We have more elements to consider
				// CHOICE 1: DON'T include the current element arr[index] // Move to next index without adding current element
				// Sum stays the same, subset stays the same backtrack(arr, target, index + 1, currentSum, currentSubset, result);
				// CHOICE 2: INCLUDE the current element arr[index]
				// Step 1: Add current element to our subset (make the choice) currentSubset.add(arr[index]); 
				// Step 2: Recursively explore with this choice
				// Move to next index, add current element's value to sum backtrack(arr, target, index + 1, currentSum + arr[index], currentSubset, result); 
				// Step 3: BACKTRACK - undo the choice we just made // Remove the last element we added to restore previous state 
				// This is crucial for exploring other possibilities currentSubset.remove(currentSubset.size() - 1); 
	}
			
		
	

}
