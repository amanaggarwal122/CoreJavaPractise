package com.google.search;

public class AA_Validations_JavaCode
{

	
	public static void main(String[] args)
	{
		String s1 = new String("Test");
		String s2 = new String("Test");
		String s3 = "Test";
		String s4 = "Test";

		System.out.println(s1 == s2);       // false (different objects)
		System.out.println(s1.equals(s2));  // true (same content)
		
		System.out.println(s3 == s4);       // True 
		System.out.println(s3.equals(s4));  // true 
		
	}
}
