package Appium.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class revision extends firstProject {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		WebElement Views = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		
		System.out.println(driver.currentActivity());
		System.out.println(driver.getOrientation());
		System.out.println(driver.getContext());
		
		Views.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}

}
