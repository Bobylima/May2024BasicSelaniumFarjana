package facebookBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {
	
	@BeforeMethod(groups="Smoke")
	public void initializeTest() {
		
	openApplication();
	}
	
	public void messengerLinkTest() {
		
	driver.findElement(By.linkText("Messenger")).click();
	
	//title validation==AsserEquals
	
	String ActualTitle= "Messenger";
	String expectedTitle= driver.getTitle();
	System.out.println("Developer Title:  "+ expectedTitle);
	Assert.assertEquals(ActualTitle ,expectedTitle);

		
	}
	
	@AfterMethod
	void tearDownTest() {
		
	}
	

}
