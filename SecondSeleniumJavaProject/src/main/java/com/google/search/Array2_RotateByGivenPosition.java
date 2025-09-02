package com.google.search;

import java.util.ArrayList;
import java.util.List;

public class Array2_RotateByGivenPosition {

	public static void main(String[] args)
	{
		// Problem 3: Rotate an Array by K Steps

//Q: Rotate an array to the right by k steps.
//
//Input: [1,2,3,4,5,6,7], k=3
//
//Output: [5,6,7,1,2,3,4]
		
		int[] given = new int[]{1,2,3,4,5,6,7};
		
		int Position = 3 ;
		List<Integer> newList = new ArrayList<>();
		
		for( int i = Position+1 ; i < given.length ; i ++ )
		{
			newList.add(given[i]);
		}
		
		for( int i = 0 ; i <= Position ; i ++ )
		{
			newList.add(given[i]);
		}
		
		System.out.println("New List si : " +newList);
		

	}

}
