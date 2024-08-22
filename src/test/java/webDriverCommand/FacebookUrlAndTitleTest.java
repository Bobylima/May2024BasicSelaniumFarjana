package webDriverCommand;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookUrlAndTitleTest {
	WebDriver driver;
	
//open application
	@BeforeMethod
	public void openApp() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	//do login test
	@Test
	public void titleTest() {
	     String actualTitle ="Facebook - log in or sign up";
		 String expectedTitle =driver.getTitle();
		System.out.println("Facebook Title is:  "+ expectedTitle);
		
		//validation/assertion
		
		Assert.assertEquals( actualTitle, expectedTitle, "reasons for failing>>>");
		Assert.assertNotEquals( expectedTitle ,"jkjkuih");
	}
	@Test
	public void urlTest() {
		String actualurl ="https://www.facebook.com/ ";
		String expectedurl=driver.getCurrentUrl();
		System.out.println( " Facebook url is>>>   "+expectedurl);
		
		//validation/assertion
		Assert.assertEquals(expectedurl,actualurl, " reasons for fail" );
		
	}
	
	//close the application
	@AfterMethod
	public void closeApp() {
		driver.quit();
		
	}
	
}
