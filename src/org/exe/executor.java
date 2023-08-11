package org.exe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class executor {
             public static void main(String[] args) {
            	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Arun\\eclipse-workspace\\locators3\\drivers\\chromedriver.exe");
            		
            		WebDriver driver = new ChromeDriver();
            		
            		driver.get("https://en-gb.facebook.com/");
            		
            		driver.manage().window().maximize();
            		
            		//object for jvascriptexeutor
            		JavascriptExecutor js = (JavascriptExecutor)driver;
            		
            		WebElement email = driver.findElement(By.id("email"));
            		js.executeScript("arguments[0].setAttribute('value','seleniuminmakes@gmail.com')", email);
            		
            		Object text = js.executeScript("return arguments[0].getAttribute('value')", email);
            		System.out.println(text);
            		
            		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
            		js.executeScript("arguments[0].setAttribute('value','123456')", password);

            		Object text1 = js.executeScript("return arguments[0].getAttribute('value')", password);
            		System.out.println(text1);
            		
            		WebElement logbtn = driver.findElement(By.name("login"));
            		js.executeScript("arguments[0].click()", logbtn);
            		
            		
            		
            		
            		
            		
            		
            		
            		
            		
            		
            		
            		
            		
			}
}
