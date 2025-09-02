package com.google.search;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class P912_ArrangeGivenDatesInSpecifiedFormat {

	public static void main(String[] args)
	{
		String[] inputs = new String[] {"07/24/2025",
				  "2025-07-22",
				  "24-Jul-2025",
				  "Jul 23, 2025",
				  "2025/07/21"};
		
		
		//Expected Output : 
//			Sorted Dates:
//				2025-07-21
//				2025-07-22
//				2025-07-23
//				2025-07-24
//				2025-07-24
		
		//SOLUTION INCOMPLETE - PLEASE REVISIT TO COMPLETE LATER
		
		Set<String> FinalDate = new LinkedHashSet<>();
		
		for(String input : inputs)
		{
			
			
			DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			LocalDate date = LocalDate.parse(input, format);
			
			String dateToadd = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			System.out.print("Final Date  : "  +dateToadd);
		
			FinalDate.add(dateToadd);
		
		}
		
		 
		
		

	}

}
