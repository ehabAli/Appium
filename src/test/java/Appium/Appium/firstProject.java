package Appium.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class firstProject {
	
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		File f = new File("src");
//		File fs = new File(f, "ApiDemos-debug.apk");
		//File fs = new File(f, "Splash.apk");
		//File fs = new File(f, "WebView Test_v1.1.5_apkpure.com.apk");
		File fs = new File(f, "General-Store.apk");
		
		
		
		AndroidDriver<AndroidElement> driver;
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        
        //you should define ATOMATION_NAME capability for Android 6 and above
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //below capability is to define the duration per second for appium to wait until element is showing
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);
        
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;
	}
}
