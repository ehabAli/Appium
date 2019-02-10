package Appium.Appium;



import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class paracticeDragDrop extends firstProject {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		//click on Views button
		WebElement ViewsButton = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		ViewsButton.click();
		
		
		//click on Drag and Drop button
		WebElement DragAndDropButton = driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")");
		DragAndDropButton.click();
		
		TouchAction t = new TouchAction(driver);
		
		WebElement first = driver.findElementsByClassName("android.view.View").get(0);
		WebElement seconf = driver.findElementsByClassName("android.view.View").get(1);
		
		t.longPress(element(first)).moveTo(element(seconf)).release().perform();

	}

}
