package com.selenium.jidhraj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtils {
	
	static WebDriver driver;
	public static WebDriver getDriver(String browser)
	{
		
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "");
			driver= new InternetExplorerDriver();
			break;
		default:
			break;
		}
	
		return driver;
	}

}
