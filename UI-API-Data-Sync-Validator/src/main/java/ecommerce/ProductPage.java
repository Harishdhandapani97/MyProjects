package com.harish.ecommercePriceStockSync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ProductPage {



	/**
	 * Page Object for product details page
	 * <p>
	 * Encapsulates interactions with product price and stock elements
	 * </p>
	 */

	    private final WebDriver driver;
	    private final WebDriverWait wait;

	    /**
	     * Initializes page object with WebDriver instance
	     * @param driver Active WebDriver instance
	     */
	    public ProductPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    /**
	     * Retrieves product price from UI
	     * @return Current displayed price
	     * @throws NumberFormatException if price text cannot be parsed
	     */
	    public double getProductPrice() {
	        WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.cssSelector(ConfigManager.getPriceSelector())
	        ));
	        return Double.parseDouble(priceElement.getText().replaceAll("[^0-9.]", ""));
	    }
	}
	
}
