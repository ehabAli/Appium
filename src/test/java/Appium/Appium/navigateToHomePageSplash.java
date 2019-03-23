package Appium.Appium;

import java.util.List;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

public class navigateToHomePageSplash extends firstProject{

	public static void main(String[] args) throws MalformedURLException {
	
AndroidDriver<AndroidElement> driver=Capabilities();

driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);


		WebElement selectCountryUAE = driver.findElementsById("com.landmarkgroup.splashfashions:id/english_title_layout").get(0);
		selectCountryUAE.click();
		
		WebElement continueButton = driver.findElementById("com.landmarkgroup.splashfashions:id/continueBtn");
		continueButton.click();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		WebElement startShopping = driver.findElementById("com.landmarkgroup.splashfashions:id/startShoppingBtn");
		startShopping.click();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SPLASH BLOG\"));");
	
		driver.findElementById("com.landmarkgroup.splashfashions:id/rightBanner").click();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		List<AndroidElement> itemsImage = driver.findElementsByClassName("android.widget.ImageView");
		itemsImage.get(1).click();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
//		Dimension size = driver.manage().window().getSize();
//		int x = size.getWidth() / 2;
//		int starty= (int)(size.getHeight() * 0.60);
//		int endy = (int)(size.getHeight()*0.10);
//		TouchAction t= new TouchAction(driver);
//
//		t.press(point(x, starty))
//
//		        .waitAction(waitOptions(ofMillis(1000)))
//
//		        .moveTo(point(x, endy))
//
//		        .release().perform();
		
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Quantity\"));");
		driver.findElementByAndroidUIAutomator("text(\"M\")").click();
		driver.findElementById("com.landmarkgroup.splashfashions:id/addToBasket").click();
	}

}
