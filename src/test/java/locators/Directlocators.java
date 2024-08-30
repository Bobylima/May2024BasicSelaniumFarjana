package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class Directlocators  extends BaseTestWithIfAndElse{
	
	public WebDriver driver;
	String browser="Chrome";

    @BeforeTest
	@BeforeMethod
public void openFacebook() {
	openApplication();
}
//@Test
     public void loginTest() {
	
	driver.findElement(By.id("email")).sendKeys("lkklk");
	driver.findElement(By.name("login")).click();
}
	@Test
public void linkTest() {
	driver.findElement(By.linkText("Français (France")).click();
			
}
	
	//@Test
	public void closeFacebook() {
		closeApplication();
	}
 }
