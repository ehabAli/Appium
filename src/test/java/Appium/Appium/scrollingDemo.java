package Appium.Appium;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollingDemo extends firstProject{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		WebElement viewButton = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		
		
		viewButton.click();
//		driver.findElementByAndroidUIAutomator("new UIScrollable(new Uiselector()).scrollIntoView(text(\"WebView\"));");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		
	}

}
