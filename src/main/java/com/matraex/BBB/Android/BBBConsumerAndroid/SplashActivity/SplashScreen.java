package com.matraex.BBB.Android.BBBConsumerAndroid.SplashActivity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SplashScreen {
	protected static   WebDriver driver;
	//To create an object of Desired Capabilities
	  protected static DesiredCapabilities caps = new DesiredCapabilities();
	
	
	  /*public static void setup() throws MalformedURLException {
		
		//To Setup the device name and Id which we will get from the cmd prompt after entering "adb devices"
		  caps.setCapability("deviceName", "device");
		  caps.setCapability("deviceid","Z55DRCKRZHDMA6BU");
		// to set the platform name and version we will use  
		  caps.setCapability("platformName", "Android");
		  caps.setCapability("platformVersion", "6.0");
		 // ((AppiumDriver) driver).installApp("/home/mataraex/Downloads/app-composer-2019-07-01.apk");
		//set the package of the app
		  caps.setCapability("appPackage", "com.deeptruth.app.composer.android");
		// set the launcher activity of the app
		  caps.setCapability("appActivity", "com.deeptruth.app.android.activity.splashactivity");	
		
		//driver object with new Url and Capabilities
		  driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		// driver = new RemoteWebDriver (new URL("http://0.0.0.0:4723/wd/hub"),caps);
		//AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }*/
	 public static void setup() throws MalformedURLException {
			
			//To Setup the device name and Id
			  caps.setCapability("deviceName", "device");
			  caps.setCapability("deviceid","ZY32287TKD");
			  
			  caps.setCapability("platformName", "Android");
			  caps.setCapability("platformVersion", "8.1.0");
			//set the package of the app
			  caps.setCapability("appPackage", "com.matraex.bbb.consumer2");
			// set the launcher activity of the app
			  caps.setCapability("appActivity", "activities.splashactivity");	
			
			//driver object with new Url and Capabilities
			  driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
			//WebDriver driver = new RemoteWebDriver (new URL("http://0.0.0.0:4723/wd/hub"),caps);
			//AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }
	
	
}


