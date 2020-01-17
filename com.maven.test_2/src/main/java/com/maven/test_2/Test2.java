package com.maven.test_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

	 @Test
	  public void launch() {
		  System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost/hospital/index.php?login");
	  }

}
