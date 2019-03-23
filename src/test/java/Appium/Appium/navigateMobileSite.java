package Appium.Appium;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class navigateMobileSite extends firstProjectChrome {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		driver.get("https://www.facebook.com");
		driver.findElementById("m_login_email").sendKeys("ehabo_91@hotmail.com");
		driver.findElementById("m_login_password").sendKeys("0799122071EHABO");
		driver.findElementByXPath("//button[@name = 'login']").click();
		
	}
}
