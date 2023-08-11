package org.exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                                  
public class sample {
      public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arun\\eclipse-workspace\\locators3\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		//to find email webelement
		WebElement email = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		email.sendKeys("selenium inmakes");
		
		// to find pw web
		WebElement passwrd = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		passwrd.sendKeys("123456");
		
		
		//to find login
		WebElement logbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        logbtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
