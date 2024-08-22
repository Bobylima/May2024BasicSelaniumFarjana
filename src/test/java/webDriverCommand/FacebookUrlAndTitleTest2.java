package webDriverCommand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class FacebookUrlAndTitleTest2 {
	WebDriver driver;
	
//open application
	@BeforeTest
	public void openApp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//do login test
	public void  titleTest() {
		
	String actualTitle= "Facebook -log in or sing up";
	String expectedTitle = driver.getTitle();
	System.out.println("Facebook title is : " + expectedTitle);
	
	// validation/ assertion
	//Assert.assertEquals(expectedTitle,actualTitle,"reasons for fail");
	//Assert.assertEquals(expectedTitle, "hkkthdri");
	
	

	// close the application

	

	}
	
	
	}
	
	
	
