package com.flipkart.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class AddToCartPagetest extends TestBase {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	

	// *[@id="container"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button
	public void validateAddToCart() {

		wait(2000);
		//System.out.println("Title in Add to cart: " + driver.getTitle());
		
		By addtocart = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
		
		WebElement addToCartButton = driver.findElement(addtocart);
		
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span")).getText());

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", addToCartButton);

		wait(2000);
//		addToCartButton.click();

		driver.findElement(addtocart).click();
	}

}
