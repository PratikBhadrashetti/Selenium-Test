package com.incedo.inc;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.incedo.inc.config.PropertiesFile;

public class SeleniumTest {

	public static String browser;

	public static WebDriver driver;

	public static String url;

	static FirefoxProfile firefoxProfile;

	static PropertiesFile propertiesFile;

	public static void main(String[] args) throws InterruptedException {
		// setBrowser();
		propertiesFile.writePropertiesFile();
		propertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();

	}

	public static void setBrowser() {
		System.out.println("######.....Inside Set Browser Method.....######");
		// browser = "Chrome";
	}

	public static void setBrowserConfig() throws InterruptedException {
		System.out.println("######.....Inside Set Browser Config Method.....######");

		switch (browser) {
		case "Chrome": {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium\\windows setup\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(1000);
		}
			break;

		case "Firefox": {
			
			/*
			 * DesiredCapabilities capabilities = new DesiredCapabilities();
			 * capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			 */

			/*
			 * ProfilesIni profile = new ProfilesIni(); FirefoxProfile ffProfile =
			 * profile.getProfile("SeleniumFF");
			 */

			System.setProperty("webdriver.gecko.driver",
					"D:\\Selenium\\windows setup\\geckodriver-v0.19.0-win64\\geckodriver.exe");

			System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");

			driver = new FirefoxDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(1000);
		}
			break;

		default:
			System.out.println(" Seomething went wrong... ");
		}
	}

	public static void runTest() {
		System.out.println("######.....Inside Run Test Method.....######");

		driver.get(url);

		// driver.close();
	}
}