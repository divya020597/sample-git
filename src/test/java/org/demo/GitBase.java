package org.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	public static void jsclick(WebElement c) {
		 JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("argument[0].click()",c);
	}
	//41
	public static String jsgetattribute(WebElement a) {
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 String tt =(String)js.executeScript("argument[0].getAttribute('value')",a);
		 return tt;
		//Simplified method
		 //return (String)js.executeScript("argument[0].getAttribute('value')",a);
	}
	public static Object scrolldwnandup( String xpath) {
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 WebElement xp = driver.findElement(By.xpath(""+xpath+""));
	    return js.executeScript("arguments[0].scrollIntoView(true)",xp);

	}
}
