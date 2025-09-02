package com.google.search;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		
		 WebDriver driver = new ChromeDriver();  // launch Chrome
        driver.get("https://www.makemytrip.com/");   // navigate to Google
        
        //driver.findElement(By.className("//labellbl_input appendBottom10"));
        //driver.findElement(By.xpath("//label[@for='departure']/span[text()='Departure']")).click();
       Thread.sleep(1000);
        driver.findElement(By.className("commonModal__close")).click();
        //commonModal__close
        Thread.sleep(1000);
        
        WebElement element = driver.findElement(By.xpath("//div[@class='fsw_inner returnPersuasion']/div[3]/label[@for='departure']/span[text()='Departure']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        
        Thread.sleep(2000);
        List<WebElement> priceElement = driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Day')]//p[contains(@class,'todayPrice')]"));

        

        
        int minimumvalue = Integer.MAX_VALUE;
        
        WebElement minimumPriceElement = null;
        for (WebElement priceEl : priceElement)
        {
            
                String priceText = priceEl.getText().trim();
                
                
                if (!priceText.isEmpty()) 
                {
                	try 
                	{
                		int price = Integer.parseInt(priceText.replaceAll("[^\\d]", ""));
                        System.out.println("Price of current element : " +price);
                        
                        if(price < minimumvalue)
                        {
                        	minimumvalue = price;
                        	minimumPriceElement = priceEl;
                        }
                        
                	}
                	catch (Exception e)
                	{
                        System.out.println("Failed to parse price: " + e.getMessage());
                        //System.out.println("Failed to parse price: " + priceText);
                    }
                }
                
                else 
                {
                    System.out.println("Price text is empty!");
                }
            }
            
        Thread.sleep(4000);
            System.out.println("Clicking on date with lowest price: ₹" + minimumvalue);
            
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", minimumPriceElement);
            
            
        }
        
//

	}

