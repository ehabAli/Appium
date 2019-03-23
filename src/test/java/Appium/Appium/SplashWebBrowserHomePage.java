package Appium.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SplashWebBrowserHomePage extends firstProjectChrome {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.get("https://www.maxfashion.com/ae/en/");
		driver.findElementByXPath("//a[@class='btn-menu btn btn-default']").click();
//		driver.findElementByXPath("//a[@href='/ae/en/login']").click();
		
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		jsc.executeScript("window.scrollBy(0,480)", "");
		//driver.findElement(By.xpath("//a[text()='Help']")).click();		

	}

}
