package com.google.search;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class P3_RemoveAllDuplicatesandMaintainOrder {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		List<Integer> input = Arrays.asList(4, 5, 4, 2, 2, 3, 1, 5, 6, 1);
		Set<Integer> uniqueSet1 = new LinkedHashSet<>(input);
		System.out.println("Unique elements preserving order unig set : " + uniqueSet1);
		
		//OR
		int[] given = new int[]{4, 5, 4, 2, 2, 3, 1, 5, 6, 1};
		
		Set<Integer> uniqueset2 = new LinkedHashSet<>();
		
		
		for(int i = 0 ; i< given.length;i++)
		{
		uniqueset2.add(given[i]);
		}
		
		System.out.println("Sorted using array: " + uniqueset2 );
		
		

	}

}
