package com.seleniumtesting.AutomationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MSDHONI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:/drivers/chromedriver.exe");

		WebDriver browser = new ChromeDriver();
    	
       // String baseUrl = "https://en.wikipedia.org/wiki/MS_Dhoni";
        
        String baseUrl = "file:///E:/website/index.html";
        
//        String expectedRun = "10,366";
        
        browser.get(baseUrl);
        
        WebElement tableObject = browser.findElement(By.tagName("table"));
        
        List<WebElement> tr_collection=tableObject.findElements(By.tagName("tr"));
        
        System.out.println(tr_collection.size());
        
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> th_collection=trElement.findElements(By.tagName("th"));
            System.out.println("NUMBER OF COLUMNS="+th_collection.size());
            
            for(WebElement thElement : th_collection) {
            	System.out.println(thElement.getText());
            }
           
        }
        
        //System.out.println(tableObject.getText());
        
        
        
//        WebElement OdiRun = browser.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div/table[1]/tbody/tr[29]/td/table/tbody/tr[3]/td[2]"));
//        
//        System.out.println(OdiRun.getText());
//        
//        if (OdiRun.getText().contentEquals(expectedRun)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
        
	
	}

}
