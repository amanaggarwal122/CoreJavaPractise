package com.google.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Array3_FindKthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Problem B – Find Kth Largest Element in an Array
//		Q: Given an array, find the Kth largest element.
//		Example:
//		Input: [3,2,1,5,6,4], k = 2
//		Output: 5
		
		//METHOD 1  - with TreeSet ( sorted) or Using Collection.Sort(ArrayList) 
		int[] input =  new int[] {3,2,1,5,6,4} ;
		int k= 2;
		 Set<Integer> sortedList = new TreeSet<>();
		 
		 for( int i = 0 ; i < input.length ; i++)
		 {
			 sortedList.add(input[i]);
			 
		 }
		 
		 System.out.println(sortedList);
		 ArrayList<Integer> list = new ArrayList<>(sortedList);
         Integer secondLastElement = list.get(list.size() - 2);
         System.out.println("Second last element: " + secondLastElement);
         
         
         //METHOD 2 -- With Sorting
         
         for( int i = 0 ; i < input.length ; i++)
		 {
			 for( int j= i+1 ; j< input.length ; j++)
			 {
				 if( input[i] > input[j])
				 {
					 int temp =  input[i] ;
					 input[i] = input[j];
					 input[j] = temp;
				 }
			 }
			 
		 }
         
         for( int i = 0 ; i < input.length ; i++)
		 {
         System.out.println("Sorted List : " +input[i]);
         System.out.println("Sorted List : " +input[i]);
		 }
         
         System.out.println("Kth Larget Element List : " +input[input.length - 2 ]);
	}

}
