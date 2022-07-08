package com.flipkart.testscenarious;

import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProductPage;
import com.flipkart.pages.SelectProductPage;
import com.flipkart.pages.AddToCartPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
	
	@BeforeClass
	public void setUp() {
		launchBrowser();
		navigateToURL();
	}

	@AfterClass
	public void tearDown() {
//		wait(10000);
//		driver.quit();
	}
	
	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("9629833624", "ms dhoni");
		Assert.assertTrue(actResult);
	}

	
	@Test
	public void seachProductTest() {
		SearchProductPage searchProductPage = new SearchProductPage();
		boolean actResult = searchProductPage.validateSearchProduct("laptop");
		Assert.assertTrue(actResult);
	}
	
	@Test
	public void selectProductTest() {
		SelectProductPage selectProductPage = new SelectProductPage();
		boolean actResult = selectProductPage.validateSelectProduct();
		Assert.assertTrue(actResult);
	}
	
	@Test
	public void addToCartTest() {
		AddToCartPage addToCartPage = new AddToCartPage();
		addToCartPage.validateAddToCart();

	}
	
	@Test
	public void placeOrderTest() {
	}
	
	@Test
	public void makePayment() {
	}
	
	@Test
	public void logoutTest() {
	}
	
}
