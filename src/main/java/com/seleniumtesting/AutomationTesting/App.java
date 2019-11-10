package com.seleniumtesting.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver","D:/drivers/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
    	
        String baseUrl = "http://google.com";
        String expectedSalary = "$13 million";

        // launch Fire fox and direct it to the Base URL
        browser.get(baseUrl);
        
        //Enter the text into text box in google search
        
        WebElement searchText = browser.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input"));
        
        searchText.sendKeys("Vishal Sikka Salary");
        searchText.submit();
        
        WebElement salary = browser.findElement(By.xpath("/html/body/div[7]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div/span/b[1]"));
        
        System.out.println(salary.getText());
        
        // get the actual value of the title
        //String actualTitle = browser.getTitle();
        //System.out.println(actualTitle);

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (salary.getText().contentEquals(expectedSalary)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        
        
       
        //close Fire fox
        //browser.close();
       
    }
}
