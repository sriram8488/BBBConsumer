package com.matraex.BBB.Android.BBBConsumerAndroid.IntroScreen;

import org.openqa.selenium.By;
import com.matraex.BBB.Android.BBBConsumerAndroid.SplashActivity.SplashScreen;

public class IntroScreeen extends SplashScreen{
	
  public static void gpsSearch () {
	  driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, 'txt_may_be_later') and @index='2']")).click();
  }
  public static void gpsEnable() {
	  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id, 'button2') and @index='0']")).click();// android.widget.Button[contains(@resource-id, 'button1') and @index='1']
	  /*Alert al = driver.switchTo().alert();
	  al.dismiss();
 */
  }
  public void ram() {
	  
  }
}
