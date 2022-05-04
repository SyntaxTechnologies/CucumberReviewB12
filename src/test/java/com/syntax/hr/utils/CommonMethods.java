package com.syntax.hr.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {

	public static WebDriver driver;

	/**
	 * This method is opening and navigating to the specified url
	 */
	public void openBrowserAndLauchApplication() {
		ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		switch (ConfigReader.getPropertyValue("browser")) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Invalid browser name");
		}
		driver.get(ConfigReader.getPropertyValue("browser"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		// intializePageObjects();
	}

	/**
	 * This method send text to any text box
	 * 
	 * @param element
	 * @param textToSend
	 */
	public static void sendText(WebElement element, String textToSend) {
		element.clear();
		element.sendKeys(textToSend);
	}

	/**
	 * This method creates an Object of WebDriverWait
	 * 
	 * @return WebDriverWait
	 */
	public static WebDriverWait getWait() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
		return wait;
	}

	public static void waitForClickability(WebElement element) {
		getWait().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	public static JavascriptExecutor getJSExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	public static void jsClick(WebElement element) {
		getJSExecutor().executeScript("arguments[0].click();", element);
	}

	public static void tearDown() {
		driver.quit();
	}

	//please write the logic for a all methods below
	
	public static void switchToFrame(WebElement element) {

	}

	public static void switchToFrame(int index) {

	}

	public static void switchToFrame(String nameOrId) {

	}
	
	public static void selectDdValue(WebElement element, String textToSelect) {
		
	}
	
	public static void selectDdValue(WebElement element, int index) {
		
	}
	
}
