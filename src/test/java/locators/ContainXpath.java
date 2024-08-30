package locators;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class ContainXpath extends BaseTestWithIfAndElse {
	
	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}
	@Test
	public void containTextMethod() {
		driver.findElement(By.xpath("//a[contain(text(),Français (France))]")).click();
		
	}
	
	//@AfterTest
	public void closeFacebook() {
		closeApplication();
	}

}
