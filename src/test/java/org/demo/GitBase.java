package org.demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitBase {
public static WebDriver driver;
	
	//method1
	public static  WebDriver launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kavi Divi\\eclipse-workspace\\Maven\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	//m2
	public static void launchurl(String url) {
		driver.get(url);
	}
	//m3
	public static void filltextbox(WebElement e,String st) {
	 e.sendKeys(st);
}
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
		
}
	
	public static void btnclick(WebElement e) {
		e.click();
	}
	public static void wndwhnd() {
		String wd1 = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		for (String wd : allid) {
			if(!wd1.equals(allid)) {	
				driver.switchTo().window(wd);
			}	

		}
	}
}
