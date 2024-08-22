package facebookLoging;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver; //instance variable
	
	@BeforeMethod
	public void openApplication() {
		
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	@Test(priority=0)
	void validLoginTest() {
		driver.findElement(By.id("email")).sendKeys("u@uamil.com");
		//driver.findElement(By.id("emil")).sendKeys("fhjieli");
		//driver.findElement(By.id("email")).sendKeys("dgfigotl");
		//driver.findElement(By.id("email")).sendKeys("furrifkfmdhfh");
		driver.findElement(By.name("pass")).sendKeys("gtrio");
		driver.findElement(By.id("login")).click();
		
		//validation
		//expected=actual=pass
		//expected!=actual=fail
		
		String actualTitle="Log into Facebook/Farjana";
		String expectedTitle=driver.getTitle();
		
		Assert.assertEquals(expectedTitle,actualTitle,"Reasons for failing" );
		
		
		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
		
	}
	
	
	@Test(priority=1)
	private void invalidLoginTest() {
		driver.findElement(By.id("email")).sendKeys("farjana@uamil.com");
		//driver.findElement(By.id("emil")).sendKeys("fhjieli");
		//driver.findElement(By.id("email")).sendKeys("dgfigotl");
		//driver.findElement(By.id("email")).sendKeys("furrifkfmdhfh");
		driver.findElement(By.name("pass")).sendKeys("gtrio");
		driver.findElement(By.id("login")).click();
		
		//expected=actual=pass
		//negative data
		
		// not equal
		
				String actualTitle="Log into Facebook/Farjana";
				//log into Facebook
				String expectedTitle=driver.getTitle();
				
				Assert.assertNotEquals(actualTitle,expectedTitle);
				Assert.assertFalse(actualTitle.equals(expectedTitle));
		
	}
	
	@AfterMethod
	protected  void closeApplication() {
		driver.quit();
	}

}
