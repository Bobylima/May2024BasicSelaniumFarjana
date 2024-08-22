package facebookBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestWithMultipleBrowser extends BaseTestWithIfAndElse  {

	@BeforeMethod
	public void openTest() {
		openApplication();
		
	}
	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("u@uamil.com");
		//driver.findElement(By.id("emil")).sendKeys("fhjieli");
		//driver.findElement(By.id("email")).sendKeys("dgfigotl");
		//driver.findElement(By.id("email")).sendKeys("furrifkfmdhfh");
		driver.findElement(By.name("pass")).sendKeys("gtrio");
		driver.findElement(By.id("login")).click();

		
	}
	@AfterMethod
	public void closeTest() {
		closeApplication();
	}
}
