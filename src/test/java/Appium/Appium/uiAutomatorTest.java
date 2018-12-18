package Appium.Appium;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiAutomatorTest extends firstProject {

public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Push']").click();
		
//		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
}
}
