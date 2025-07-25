package com.google.search;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class P5_StringManipulation_And_RemoveDuplicates {

	public static void main(String[] args)
	{
		List<String> givenemails = Arrays.asList(
				  "user1@gmail.com", 
				  "User2@Gmail.com", 
				  "admin@yahoo.com", 
				  "info@yaHOO.com", 
				  "admin@outlook.com"
				);

		//Expected Output : [yahoo.com, gmail.com, outlook.com]
		
		Set<String> uniqueDomain = new LinkedHashSet<>();
		 // Use TreeSet for sorted + unique values 
		//Set<String> uniqueDomains = new TreeSet<>();
	
		
		for(String email : givenemails)
		{
			
			String[] twopartstring = email.split("@");
			
			String domain = twopartstring[1].toLowerCase();
			
			
			uniqueDomain.add(domain);
			
		}
		
		System.out.println("Sorted Unique Domains: " + uniqueDomain);
		
	}

}
