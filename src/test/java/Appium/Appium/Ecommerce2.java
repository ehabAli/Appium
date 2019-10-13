package Appium.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce2 extends firstProject{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("hello");
		driver.findElementByXPath("//*[@text='Female']").click();
		
		//click on drop down list to expand
		driver.findElementById("android:id/text1").click();
		//normal scroll (scroll till text appeared)
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		
		driver.findElementByXPath("//*[@text='Argentina']").click();
		
		//click on submit button
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
				
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector())"
//				+ ".scrollIntoView(text(\"Jordan 6 Rings\"));");
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".resourceId(\"com.androidsample.generalstore:id/rvProductList\"))"
				+ ".scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		
		int itemsCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		
		for(int i=0; i<itemsCount;i++)
		{
			String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("Jordan 6 Rings")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
			}else {
				System.out.println("text not foud and use a better scrolling function");
			}
		}
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
}