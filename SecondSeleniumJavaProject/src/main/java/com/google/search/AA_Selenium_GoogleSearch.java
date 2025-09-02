package com.google.search;

import java.lang.reflect.Array;
import java.time.Duration;
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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AA_Selenium_GoogleSearch {
    public static void main(String[] args) throws InterruptedException
    {
        // Optional: Set path manually if WebDriver is not auto-managed
        // System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();  // launch Chrome
        driver.manage().window().maximize();
      driver.get("https://www.google.com/");   // navigate to Google

        //WebElement dropdown = driver.findElement(By.className("form-select"));  // locate search box
      
      WebElement searchBox = driver.findElement(By.name("q"));
      searchBox.click();
      searchBox.sendKeys("chat");
      
      
    //Now Take it into a List
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      
      
      
      // Wait for suggestions
      wait.until(ExpectedConditions.visibilityOfElementLocated(
              By.xpath("//ul[@role='listbox']//li//div[@role='option']//span")));

      // FIX: Use fresh list in each iteration to avoid stale elements
      List<WebElement> suggestions = driver.findElements(
              By.xpath("//ul[@role='listbox']//li//div[@role='option']//span"));

      for (int i = 0; i < suggestions.size(); i++) {
          // Re-fetch the elements before every iteration
          suggestions = driver.findElements(
              By.xpath("//ul[@role='listbox']//li//div[@role='option']//span"));

          String text = suggestions.get(i).getText();
          System.out.println("Suggestion: " + text);

          if (text.equalsIgnoreCase("chatgpt")) {
              suggestions.get(i).click();
              break;
          }
      }
      
      
      
      
      
      
      
      //wait.until(ExpectedConditions.visibilityOf(By.xpath("//ul[@role='listbox']//li//div[@role='option']//span")));
      
      
      List<WebElement> searchList = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']//span"));
      
      for(WebElement option : searchList)
      {
    	  wait.until(ExpectedConditions.visibilityOf(option));
    	  
    	  String text = option.getText();
          System.out.println("Suggestion: " + text);
      }
      
      System.out.println(searchList);
    		  			
        }      
        
    }
    
    
    
    
   
    
    
    