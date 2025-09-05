package com.google.search;

import java.util.ArrayList;
import java.util.List;

public class Array5_ArrangePositiveNegativeAlternatively {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] input = {-5, -2, 5, 2, 4, -7, -1, 8, -3,-6};
		
		
		List<Integer> Negative = new ArrayList<>();
		List<Integer> Positive = new ArrayList<>();
		
		
		for(int i = 0 ; i <= input.length-1 ; i++)
		{
			if(input[i] >= 0)
			{
				Positive.add(input[i] );
			}
			else
			{
				Negative.add(input[i]);
			}
			
		}
		
		for(int i = 0 ; i < ( Math.min(Negative.size() , Positive.size())) ;i++)
		{
			System.out.print(Negative.get(i));
			System.out.print(" , ");
			System.out.print(Positive.get(i));
			System.out.print(" , ");
		}
		
		if(Positive.size() > Negative.size())
		{

			for(int i = ( Math.min(Negative.size() , Positive.size())) ; i < ( Math.max(Negative.size() , Positive.size())) ;i++)
			{
				
				//System.out.print(" , ");
				System.out.print(Positive.get(i));
				System.out.print(" , ");
				
			}
		}
		else
		{
			for(int i = ( Math.min(Negative.size() , Positive.size())) ; i < ( Math.max(Negative.size() , Positive.size())) ;i++)
			{
				
				//System.out.print(" , ");
				System.out.print(Negative.get(i));
				System.out.print(" , ");
				
			}
		}
		
		
	}

}
