package Appium.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends firstProject{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
	
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		/* Waitting per seconds */
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementById("android:id/edit").sendKeys("hello");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		// nothing else to add to this class
		// another comment to add
		
	}
}
