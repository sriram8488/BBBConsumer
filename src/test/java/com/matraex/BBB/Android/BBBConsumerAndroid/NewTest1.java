package com.matraex.BBB.Android.BBBConsumerAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.matraex.BBB.Android.BBBConsumerAndroid.IntroScreen.IntroScreeen;
import com.matraex.BBB.Android.BBBConsumerAndroid.SplashActivity.SplashScreen;

public class NewTest1 {
  @BeforeTest
  public void launch() throws MalformedURLException {
	  SplashScreen.setup();
  }
  @Test
  public void clickOnNoGPSSearchButton() throws InterruptedException {
	  IntroScreeen.gpsSearch();
	  Thread.sleep(10000);
  }
  @Test
  public void clickOnNoButtonForGps() {
	  IntroScreeen.gpsEnable();
	  
  }
}
