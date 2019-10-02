package Appium.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce2 extends firstProject{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("hello");
		driver.findElementByXPath("//*[@text='Female']").click();
		driver.findElementById("android:id/text1").click();
		//normal scroll (scroll till text appeared)
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		
		driver.findElementByXPath("//*[@text='Argentina']").click();
		
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		System.out.println(driver.findElements(By.id("com.androidsample.generalstore:id/productImage")).size());
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));");
	}
}