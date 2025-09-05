package com.google.search;

import java.util.ArrayList;
import java.util.List;

public class Array6_MissingNumberIn1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3,6};
		int n = 6;
		List<Integer> mylist = new ArrayList<>();
		
		//5 and 8 are missing , find and fill
		
		for(int i = 0 ; i < arr.length -1; i++)
		{
			
			if(arr[i+1] - arr[i]==1)
			{
				mylist.add(arr[i]);
				
			}
			else
			{
				int diff = arr[i+1] - arr[i];
				
				for(int j = arr[i] ; j < arr[i+1]; j++)
				{
					mylist.add(j);
					
				}
				
				//mylist.add((arr[i]+1));
			}
			
			
		}
		
		// Check if last number < n
        if (arr[arr.length - 1] < n) {
            for (int num = arr[arr.length - 1] + 1; num <= n; num++) {
            	mylist.add(num);
            }
        }
		
		System.out.print(mylist);

	}

}
