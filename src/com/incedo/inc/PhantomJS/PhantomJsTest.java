package com.incedo.inc.PhantomJS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJsTest {

	public static void main(String[] args) {

		System.setProperty("phantomjs.binary.path", "D:\\Selenium\\windows setup\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		WebDriver driver = new PhantomJSDriver(); 
		
		driver.get("http://seleniumhq.org");
		
		System.out.println(" Title Of Browser : " + driver.getTitle());

	}

}
