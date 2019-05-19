package Initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {

	public static WebDriver wd = null;

	public static FileInputStream locatorFIS = null;
	public static Properties locatorprop = null;

	public static void ob(String browser) throws IOException {

		locatorFIS = new FileInputStream(
				new File("G:\\Greentech\\workspace\\SecondProject\\src\\test\\resources\\Files\\xpath.properties"));
		locatorprop = new Properties();
		locatorprop.load(locatorFIS);

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"G:\\Greentech\\workspace\\SecondProject\\driver\\chromedriver.exe");
			wd = new ChromeDriver();
		} else {
			System.out.println("Browser not available");
		}
	}

	public static WebElement getxpath(String xpath) {
		return wd.findElement(By.xpath(locatorprop.getProperty(xpath)));

	}

}
