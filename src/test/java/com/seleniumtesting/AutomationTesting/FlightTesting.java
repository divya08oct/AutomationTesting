package com.seleniumtesting.AutomationTesting;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlightTesting {

	WebDriver browser;
	
	// Call only single time
	@BeforeClass
	public static void testInit() {
		System.setProperty("webdriver.chrome.driver","D:/drivers/chromedriver.exe");

		
	}
	
	//Calls for every test case
	@Before
	public void setUp() {
//		browser = new ChromeDriver();
	}
	
	//Test case to execute
//	@Test
//	public void test1() {
//		 String baseUrl = "https://www.goindigo.in/";
//		 browser.get(baseUrl);
//		 
//		 WebElement loginButton = browser.findElement(By.xpath("/html/body/div[5]/section/div/nav/div/div[4]/ul/li[8]/a"));
//		 loginButton.click();
//		 
//		 WebElement mobileNumber = browser.findElement(By.xpath("//*[@id=\"memberId\"]"));
//		 mobileNumber.clear();
//		 mobileNumber.sendKeys("9717255284");
//		 
//		 WebElement password = browser.findElement(By.xpath("//*[@id=\"mobilePass\"]"));
//		 password.clear();
//		 password.sendKeys("Divya92");
//		 
//		 WebElement signInButton = browser.findElement(By.xpath("/html/body/div[52]/div[1]/div/div/div[2]/div/div/form/div[4]/div/div[1]/button/span[1]"));
//		 signInButton.click();
//		 
//		 String title = "Online Flight Booking for Domestic & International Destinations | IndiGo";
//		 assertEquals(title, browser.getTitle());
//	}
//	
//	@Test
//	public void test2() throws InterruptedException {
//		//String baseUrl = "https://www.goindigo.in/";
//		String baseUrl = "https://www.spicejet.com/";
//		 browser.get(baseUrl);
//		 
//		 try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 
//		 WebElement RoundTripButton = browser.findElement(By.xpath("//*[@id=\"roundTrip\"]"));
//		 RoundTripButton.click();
//		
//		 WebElement From = browser.findElement(By.xpath("/html/body/div[5]/section/div/div[2]/div/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div/input"));
//		 From.click();
//		 
//		 From.sendKeys("Varanasi (VNS)");
//		 From.sendKeys("\n");
//		 From.click();	 
//		 
//		 WebElement To = browser.findElement(By.xpath("/html/body/div[5]/section/div/div[2]/div/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div/input"));
//		 To.click();
//		 To.clear();
//		 To.sendKeys("Allahabad (IXD)");
//		 
//		 WebElement Date =browser.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[4]/button"));
//		Date.click();
//		
//		System.out.println(date.getAttribute("value"));
//		 date.sendKeys("31-01-2019");
//		
//		Thread.sleep(3000);
//		 
//		browser.findElement(By.xpath("/html/body/div[5]/section/div/div[2]/div/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/input")).click(); 
//		WebElement year = browser.findElement(By.xpath("/html/body/div[5]/section/div/div[2]/div/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[3]/div/div[1]/div/div/select[2]"));
//		year.click();
//		Select dropdown = new Select(year);
//		dropdown.selectByVisibleText("2019");
//		
//		Actions a = new Actions(browser);
//		
//		a.moveToElement(Date).doubleClick().build().perform();
//		
//		WebElement DA =browser.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[5]/a"));
//		
//		a.moveToElement(DA).click().build().perform();
//		
	//browser.findElement(By.xpath("/html/body/div[5]/section/div/div[2]/div/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[3]/div/div[1]/table/tbody/tr[5]/td[5]/a")).click();
//		WebElement select31 = browser.findElement(By.xpath("/html/body/div[5]/section/div/div[2]/div/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[3]/div/div[1]/table/tbody/tr[5]/td[5]/a"));
//		select31.click();
//	}
	
	@Test
	public void test3() {
		
//		String url = "file:///E:/website/page1.html";
//		browser.get(url);
//		
//		WebElement address = browser.findElement(By.xpath("//div[@class='xyz']/span[1]/div[1]"));
//		System.out.println(address.getText());
		
//		Runtime runtimeObject = Runtime.getRuntime();
//		
//		try {
//			runtimeObject.exec("notepad");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		PrintWriter writer;
//		try {
//			writer = new PrintWriter("E:/testing/the-file-name.txt", "UTF-8");
//			writer.println("The first line");
//			writer.println("The second line");
//			writer.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	// Calls after every test case
	//v1.1 by vishal
	@After
	public void tearDown() {
		
		//browser.close();
		
	}
	
	//Call after executing all test cases
	@AfterClass
	public static void testClose() {
		//Database connection or Excel connection close
	}

}
