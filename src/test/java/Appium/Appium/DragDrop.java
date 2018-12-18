package Appium.Appium;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragDrop extends firstProject {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
//		WebElement Views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		//WebElement Views = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
//		WebElement dragDrop = driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")");
		//WebElement dragDrop = driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")");
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		

		WebElement first = driver.findElementsByClassName("android.view.View").get(0);
		WebElement seconf = driver.findElementsByClassName("android.view.View").get(1);
		
//		Views.click();
//		dragDrop.click();
		
		TouchAction t = new TouchAction(driver);
		
		//t.longPress(longPressOptions().withElement(element(first))).moveTo(element(seconf)).release().perform();
		t.longPress(element(first)).moveTo(element(seconf)).release().perform();


	}

}
