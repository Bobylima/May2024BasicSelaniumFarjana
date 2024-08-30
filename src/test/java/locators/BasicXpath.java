package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class BasicXpath  extends BaseTestWithIfAndElse{
	
	
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}
 
	@Test
	public void xPathFormula() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ff5");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("mmoo");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@Test
	public void linkXpath() {
		driver.findElement(By.xpath("//a[@title='French (France)']")).click();
	}
	
	//@AfterTest
	public void closeFacebook() {
		closeApplication();
	}
}
