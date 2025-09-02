package com.google.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Array1_FindIntegersToTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Given an array of integers and a target sum, return the indices of two numbers that add up to the target.
//		Input: [2, 7, 5, 4,3], target = 9
//		Output: [0,1] (because nums[0] + nums[1] = 9)
		
		
				// Add TWO NUmber Logic to get final output
		
		
		int[] given = new int[]{2, 7, 5, 4,3,7,1};
		
		int i ,j;
		
		for( i = 0 ; i < given.length ; i++)
		{
			for( j = i+1 ; j < given.length ; j++)
			{
				if(given[i] + given[j] == 9)
				{
			System.out.println("Number that add upto 9 are : " +given[i] +" and " +given[j]);	
			System.out.println("Position that add upto 9 are : " +i +" and " +j);
				}
				
			}
		}
		
		
		
		// Add Any number's Logic to make final output sum as in question 
		//Beside above answer 2+7 , 5+4 we have 5+3+1 = 9 & 2+4+3 = 9( we have not take 3 numbers in case1
		
		
		    int n = given.length;
		    int target = 9;
	        List<List<Integer>> result = new ArrayList<>();

	        // loop through all subsets (2^n possibilities)
	        for (int mask = 0; mask < (1 << n); mask++) {
	            List<Integer> subset = new ArrayList<>();
	            int sum = 0;

	            for (int k = 0; k < n; k++) {
	                if ((mask & (1 << k)) != 0) 
	                { // if bit is set
	                    subset.add(given[k]);
	                    sum += given[k];
	                }
	            }

	            if (sum == target) {
	                result.add(subset);
	            }
	        }

	        System.out.println("All combinations that sum to " + target + ":");
	        for (List<Integer> combo : result) {
	            System.out.println(combo);
	        }
		
				
	}

}
