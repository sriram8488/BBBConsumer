package com.matraex.BBB.Android.BBBConsumerAndroid.IntroScreen;

import org.openqa.selenium.By;
import com.matraex.BBB.Android.BBBConsumerAndroid.SplashActivity.SplashScreen;

public class IntroScreeen extends SplashScreen{
	
  public static void gpsSearch () {
	  driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, 'txt_may_be_later') and @index='2']")).click();
  }
  public static void gpsEnable() {
	  /*WebElement element= driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'button2') and @index='0']"));
	  WebDriverWait wait= new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	  element.click();*/
	  //driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'button2') and @index='0']")).click();// android.widget.Button[contains(@resource-id, 'button1') and @index='1']
	  //driver.findElement(By.xpath("//android.widget.Button[@text='NO']")).click();
	  //driver.findElement(By.id("android:id/button2")).click();
	  //driver.findElement(By.className("//android.widget.Button")).click();
	  String actval=driver.findElement(By.id("android:id/message")).getText();
	  System.out.println(actval);
	  String expval="GPS is disabled in your device. Would you like to enable it?";
	  
 
  }
  
}
