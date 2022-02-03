package com.ha.openemr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MessageTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmyap\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openemr.io/b/openemr");
	
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select lang = new Select(driver.findElement(By.name("languageChoice")));
		lang.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	}

}
