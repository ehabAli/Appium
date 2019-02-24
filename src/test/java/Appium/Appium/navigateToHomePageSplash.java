package Appium.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class navigateToHomePageSplash extends firstProject{

	public static void main(String[] args) throws MalformedURLException {
		

AndroidDriver<AndroidElement> driver=Capabilities();
		
		WebElement selectCountryUAE = driver.findElementsById("com.landmarkgroup.splashfashions:id/english_title_layout").get(0);
		selectCountryUAE.click();
		
		WebElement continueButton = driver.findElementById("com.landmarkgroup.splashfashions:id/continueBtn");
		continueButton.click();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		WebElement startShopping = driver.findElementById("com.landmarkgroup.splashfashions:id/startShoppingBtn");
		startShopping.click();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pants and joggers\"));");
	
		
	}

}
