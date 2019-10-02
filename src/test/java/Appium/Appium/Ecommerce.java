package Appium.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce extends firstProject{
	
	/*this class to verify two scenarios:
	 * scrolling down and DDL line 27
	 * catching the Toast error message and assert line 30 - 33
	 */
	

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		//driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("hello");
		//driver.findElementByXPath("//*[@text='Female']").click();
		driver.findElementById("android:id/text1").click();
		//scroll down and click on specific option
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		driver.findElementByXPath("//*[@text='Argentina']").click();
		
		// click in submit button
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		//handle toast message
		String toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toastMessage);
		Assert.assertEquals(toastMessage, "Please enter your name");
	}

}
