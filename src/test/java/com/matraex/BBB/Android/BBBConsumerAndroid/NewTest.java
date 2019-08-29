package com.matraex.BBB.Android.BBBConsumerAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import com.matraex.BBB.Android.BBBConsumerAndroid.SplashActivity.SplashScreen;;


public class NewTest {
  @BeforeTest
  public void launch() throws MalformedURLException {
	  SplashScreen.setup();
	 }
  /*@Test
  public void initro() {
	  IntroScreen.recordNowButton();
	  IntroScreen.clickOnAllowButtons();
	  IntroScreen.clickOnAllowLocation();
	  IntroScreen.clickOnAllowRecord();
	  IntroScreen.allowNotification();
	  }
  @Test
  public void videoRecordScreen() throws InterruptedException, IOException {
	  Drawer.openDrawer();
	  Drawer.swipeVertically();
	  Thread.sleep(3000);
	  Drawer.swipeHorizontally();
	  Drawer.closeDrawer();
	  
	  VideoRecording.startVideoRecord();
	  Drawer.openDrawer();
	  Drawer.swipeVertically();
	  Thread.sleep(3000);
	  Drawer.swipeHorizontally();
	  Drawer.closeDrawer();
	  Thread.sleep(2000);
	  VideoRecording.stoptVideoRecord();
	  
	  Thread.sleep(5000);
	  
	  MediaList.clickOnMediaThumbnail();
	 
  }
  @Test
  public void allMedia() {
	  MediaList.clickOnGridView();
	  MediaList.clickOnListView();
  }*/
}
