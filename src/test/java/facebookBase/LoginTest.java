package facebookBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@BeforeMethod
	 public void initializeTest() {
		openApplication();
		
		
	}

	@Test      //1:30min
	private void  loginTest() {
		driver.findElement(By.id("email")).sendKeys("u@uamil.com");
		//driver.findElement(By.id("emil")).sendKeys("fhjieli");
		//driver.findElement(By.id("email")).sendKeys("dgfigotl");
		//driver.findElement(By.id("email")).sendKeys("furrifkfmdhfh");
		driver.findElement(By.name("pass")).sendKeys("gtrio");
		driver.findElement(By.id("login")).click();
		

		String actualTitle="Log into Facebook/Farjana";
		String expectedTitle=driver.getTitle();
		
		System.out.println(expectedTitle);
		
		Assert.assertEquals(expectedTitle,actualTitle,"Reasons for failing" );
		
	}
	
	
	void tearDownTest() {
		closeApplication();
	}

}
