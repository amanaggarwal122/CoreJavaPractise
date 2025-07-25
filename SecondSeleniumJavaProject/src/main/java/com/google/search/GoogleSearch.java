package com.google.search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException
    {
        // Optional: Set path manually if WebDriver is not auto-managed
        // System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");

//        WebDriver driver = new ChromeDriver();  // launch Chrome
//        driver.get("https://www.selenium.dev/selenium/web/web-form.html");   // navigate to Google
//
//        WebElement dropdown = driver.findElement(By.className("form-select"));  // locate search box
//       
//        Select select = new Select(dropdown);
//        select.selectByVisibleText("One");                 
//
//        Thread.sleep(5000);
//        System.out.println("Title: " + driver.getTitle());        // print result
//        driver.quit();       
//        
//        
//        
//        
//        // close browser
//        
//        
//        
//        String giventext = "abbabcbb";
//        
//        Map<Character ,Integer> mymap = new HashMap<Character, Integer>();
//        
//        char[] arr = giventext.toCharArray();  // arr[0] = A and arr[1] = b 
//        
//        for ( int i = 0 ; i < giventext.length(); i++ )
//        {
//        	int currentcount = 1;
//        	 List li = new ArrayList(); 
//        	if ( mymap.containsKey(arr[i]))
//        			{
//        				mymap.clear();
//        			}
//        	else
//        	{
//        		
//        		mymap.put(arr[i], currentcount);
//        		currentcount ++ ;
//        		
//        		li.add(arr[i]);
//        		
//        		
//        		
//        		
//        		
//        		
//        	}
//        	
//        	
    	int[] arr = {1, 4, 5, 7, 4, 6, 5, 5, 10, 0};
    	 Set<String> CreatePairs = new HashSet<>();
    	 
    		for(int i = 0 ;i < arr.length; i++)
    		{
    			for(int j = i+1 ; j < arr.length ; j++)
    			{
    				if ( arr[i] + arr[j] == 10)
    				{
    					
    					int a = arr[i];
                        int b = arr[j];
                        String key = a + ":" + b;

                        if (!CreatePairs.contains(key)) 
                        {
                        	CreatePairs.add(key);
                            
    					 System.out.println("pair found with values " +arr[i] +" " + arr[j] );
    					 System.out.println("pair found at index: " +i +"  " +j);
                        }
    					 
    				}
    			}
    		}
    		  			
        }      
        
    }
    
    
    
    
   
    
    
    