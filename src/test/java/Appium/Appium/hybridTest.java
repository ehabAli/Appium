package Appium.Appium;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class hybridTest extends firstProject{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementById("com.snc.test.webview2:id/action_go_website").click();
		driver.findElementById("com.snc.test.webview2:id/input_url").sendKeys("www.facebook.com");
		driver.findElementById("android:id/button1").click();
		System.out.println(driver.getContextHandles());
		
		driver.context("WEBVIEW_com.snc.test.webview2");
		
		driver.findElementById("m_login_email").sendKeys("ehabo_91@hotmail.com");
		driver.findElementById("m_login_password").sendKeys("123123123");
		driver.findElementById("u_0_5").click();
	}
}
