package Appium.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class firstProjectIOS {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		cap.setCapability(MobileCapabilityType.APP, "/Users/Ehab/Desktop/ios-uicatalog-master/UICatalog.app");
		
		IOSDriver<IOSElement>driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		}

}
