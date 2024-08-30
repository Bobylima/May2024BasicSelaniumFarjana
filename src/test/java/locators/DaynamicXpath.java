package locators;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class DaynamicXpath  extends BaseTestWithIfAndElse{
	
	
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}
 
	@Test
	public void daynamicXPathFormula() {
		driver.findElement(By.xpath("//button[starts-with(@id, 'u_0_5')]")).click();
		
	}
	
	
	//@AfterTest
	public void closeFacebook() {
		closeApplication();
	}
}
