package Appium.Appium;

import java.net.MalformedURLException;

import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class dropDownList extends firstProject {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByName("Views").click();
		driver.findElementByName("Controls").click();
		driver.findElementByName("2. Dark Theme").click();
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Test");
		driver.hideKeyboard();
		driver.findElementById("android:id/text1").click();
		driver.findElementByName("Mars").click();
		
		driver.quit();
	}
}
