package Appium.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class SplashWebBrowserHomePage extends firstProjectChrome {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.get("https://www.maxfashion.com/ae/en/register");
		//driver.findElementById("account-actions-signup").click();
		
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		
		
		driver.findElementById("standaloneFullName").sendKeys("Ehab Ali ");
		driver.findElementById("standalone-email").sendKeys("ehab@google.com");
		driver.findElementById("standalone-pwd").sendKeys("123123");
		
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		//jsc.executeScript("window.scrollBy(0,250)", "");
		jsc.executeScript("arguments[0].scrollIntoView(true);",driver.findElementById("signup-form-submit"));
		
		driver.findElementById("mobileFieldVerifySignUpStandalone").sendKeys("0544554797");
		SplashWebBrowserHomePage obj = new SplashWebBrowserHomePage();
		
		WebElement dayDDL = driver.findElementByName("dateOfBirthDay");
		Select dayObj = new Select(dayDDL);
		dayObj.selectByVisibleText("04");
		
		WebElement monthDDL = driver.findElementByName("dateOfBirthMonth");
		Select monthObj = new Select(monthDDL);
		monthObj.selectByIndex(5);
		
		
		
		int framNumber = obj.switchToFrame(driver, By.id("recaptcha-anchor"));
		driver.switchTo().frame(framNumber);
		driver.findElement(By.id("recaptcha-anchor")).click();
		driver.switchTo().defaultContent();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		int frameNumber2 = obj.switchToFrame(driver, By.id("recaptcha-verify-button"));
		driver.switchTo().frame(frameNumber2);
		driver.findElementById("recaptcha-verify-button").click();
			
		}
	
	public static int switchToFrame(WebDriver driver, By by) {
		int i;
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		
		for(i = 0;i<frameCount; i++)
		{
		driver.switchTo().frame(i);
		int count = driver.findElements(by).size();
		
		if (count>0) {
			
			break;
		}
		else {
			System.out.println("continue looping");
		}
		}
		driver.switchTo().defaultContent();
		return i;
	}
}
