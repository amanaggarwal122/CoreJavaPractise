package com.google.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array7_MergeTwoSortedArray {

	public static void merge(int[] arr1, int[] arr2, int n, int m) {
        for (int i = 0; i < n; i++) {
            if (arr1[i] > arr2[0]) {
                // Swap arr1[i] and arr2[0]
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // Place arr2[0] at correct position in arr2
                Arrays.sort(arr2);
               
            }
        }
    }
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] sorted1 = {1, 3, 5, 7};
		int[] sorted2 = {2, 4, 6, 8};
		
		Set<Integer> mySorted = new HashSet<>();
		
		for(int i = 0 ; i < sorted1.length ; i++)
		{
			mySorted.add(sorted1[i]);
			
		}
		for(int i = 0 ; i < sorted2.length ; i++)
		{
			mySorted.add(sorted2[i]);
			
		}
		
		System.out.println(mySorted);
		
		
		//arr1 = [1, 3, 5, 7]  
		//arr2 = [2, 4, 6, 8]  
//		Output:
//		arr1 = [1, 2, 3, 4]  
//		arr2 = [5, 6, 7, 8]	

		merge(sorted1,sorted2 , sorted1.length , sorted2.length);
		for(int i = 0 ; i < sorted2.length ; i++)
		{
		System.out.println("sorted 1 : " +sorted1[i]);
		System.out.println("sorted 2 : " +sorted2[i]);
		}
		
	}

}
