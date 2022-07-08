package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class SearchProductPage extends TestBase {

	By searchLoc = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public boolean validateSearchProduct(String productName) {
		wait(2000);
		driver.findElement(searchLoc).sendKeys(productName);
		wait(2000);
		driver.findElement(searchLoc).sendKeys(Keys.ENTER);
		
		boolean flagResult = true;
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")));	
		}catch(TimeoutException te) {
			captureScreenshot("Login Failure");
			flagResult = false;
		}
		
		if(flagResult) {
		String actResult = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/span/span")).getText();
		return actResult.equals("laptop");
		}
		else 
		return false;
		
	}
}
