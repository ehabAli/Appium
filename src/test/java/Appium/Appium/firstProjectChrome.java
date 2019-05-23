package Appium.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class firstProjectChrome {
	
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver;
		
		DesiredCapabilities cap = new DesiredCapabilities();
		

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
	

	
}
