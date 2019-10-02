package Appium.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class gestures extends firstProject {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		TouchAction t = new TouchAction(driver);
//		WebElement expandable_list = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
//		WebElement customAdaptor =driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
////		
//		expandable_list.click();
//		customAdaptor.click();
//		
//		t.tap(tapOptions().withElement(element(expandable_list))).perform();
//		t.tap(tapOptions().withElement(element(customAdaptor))).perform();
		
		
		WebElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		t.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
	}

}
