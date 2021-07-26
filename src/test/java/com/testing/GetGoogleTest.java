package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleTest {
	
	public void getLogin() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.xpath("//input[contains(@name,'q')]"));
		element.sendKeys("Bangladesh is rural country");
		element.sendKeys(Keys.ENTER);
	}
 public static void main(String[] args) {
	new GetGoogleTest().getLogin();
}
}
