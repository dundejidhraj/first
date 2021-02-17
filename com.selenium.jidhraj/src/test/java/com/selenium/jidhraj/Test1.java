package com.selenium.jidhraj;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class Test1 {

	WebDriver driver;
	PropertyReader propertyReader = new PropertyReader();

	@Before
	public void initialise() {
		System.out.println("Before Running Test");

		try {
			driver = DriverUtils.getDriver(propertyReader.readPropertyValue("browser"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public void test1() {

		driver.get("http://automationpractice.com");
		System.out.println(driver.getTitle());
		Assert.assertTrue("Titles are not matching",driver.getTitle().equals("My Store") );
	}

	@After
	public void tearDown() {
		driver.close();
	}

}
