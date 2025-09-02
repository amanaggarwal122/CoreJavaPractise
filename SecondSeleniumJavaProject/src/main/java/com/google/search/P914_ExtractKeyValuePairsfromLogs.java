package com.google.search;

import java.util.HashMap;
import java.util.Map;

public class P914_ExtractKeyValuePairsfromLogs {

	public static void main(String[] args)
	{
		// "timestamp=2025-07-25 level=ERROR userId=am123 
		//message=Login failed attemp=2"

		//{
//		  timestamp=2025-07-25,
//				  level=ERROR,
//				  userId=am123,
//				  message=Login failed,
//				  attemp=2
//				}
		
		String input = "timestamp=2025-07-25 level=ERROR userId=am123 message=Login failed attemp=2";
		
		String[] withoutSpace = input.split(" ");
		
		//System.out.print(mymap);
		
		Map<String, String> mymap = new HashMap<>();
		
		for(String text : withoutSpace)
		{
			System.out.println( "Text after split space " +text);
			System.out.println( "");
			
			String[] mytext =  text.split("=");
			
			mymap.put(mytext[0]  , mytext[1]);
		}
		
		System.out.print(mymap);

	}

}
