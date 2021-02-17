package com.selenium.jidhraj;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	Properties prop = new Properties();
	InputStream inputStream;

	public String readPropertyValue(String propertyName) throws FileNotFoundException {

		String propFileName = "config.properties";

		inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

		if (inputStream != null) {
			try {
				prop.load(inputStream);

			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} else {
			throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
		}

		return prop.getProperty(propertyName);
	}

}
