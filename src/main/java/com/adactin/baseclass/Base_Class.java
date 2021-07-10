package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\Drivers\\chromedriver.exe"));
				driver = new ChromeDriver();
				
			}
			else if (browser.equalsIgnoreCase("edge")) {
				
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + ("\\Drivers\\msedgedriver.exe"));
				driver = new EdgeDriver();
			}
			else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;

	}
	
	public static void getUrl(String value) {
		
		driver.get(value);

	}
	
	public static void inputOfElement(WebElement element , String value) {
		element.sendKeys(value);
		
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();

	}
	
	public static void clearOnElement(WebElement element) {
		element.clear();

	}

}
