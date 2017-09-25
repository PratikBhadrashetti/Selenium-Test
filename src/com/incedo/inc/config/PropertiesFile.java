package com.incedo.inc.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import com.incedo.inc.SeleniumTest;

public class PropertiesFile {

	static Properties properties = new Properties();
	
	public static void main(String[] args) {
	 
		 readPropertiesFile();
		 writePropertiesFile();
	}
	
	public static void readPropertiesFile()
	{	
		System.out.println("#####.....Inside Read Properties File.....#####");

		try {
			
			InputStream inputStream = new FileInputStream("D:\\Selenium-WorkSpace\\Selenium-1\\src\\com\\incedo\\inc\\config\\config.properties");
			properties.load(inputStream);
			properties.getProperty("webdriver.chrome.driver");
			properties.getProperty("webdriver.gecko.driver");
			properties.getProperty("webdriver.firefox.bin");
			//properties.getProperty("browser");
			//properties.getProperty("url");
			
			SeleniumTest.browser = properties.getProperty("browser");
			SeleniumTest.url = properties.getProperty("url");
		} 
		catch (Exception error) {
			error.printStackTrace();
			System.out.println(error.getMessage());
		}
	}
	
	public static void writePropertiesFile()
	{	
		System.out.println("#####.....Inside Write Properties File.....#####");

		try {
			
			OutputStream outputStream  = new FileOutputStream("D:\\Selenium-WorkSpace\\Selenium-1\\src\\com\\incedo\\inc\\config\\config.properties");
			properties.setProperty("browser" ,"Chrome");
			properties.setProperty("webdriver.chrome.driver", "D:\\Selenium\\windows setup\\chromedriver_win32\\chromedriver.exe");
			properties.setProperty("webdriver.gecko.driver", "D:\\Selenium\\windows setup\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			properties.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe" );
			properties.setProperty("url", "https://www.google.com/gmail/about/#");
			properties.store(outputStream, null);
		} 
		catch (Exception error) {
			error.printStackTrace();
			System.out.println(error.getMessage());
		}
	}
}
