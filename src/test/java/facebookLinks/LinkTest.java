package facebookLinks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTest {
	WebDriver driver; // class level variable
	
	@BeforeTest
	public void openAppilcation(){
		
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		
		
	}

	
	@AfterTest
	public void closeApplication() {
		
		//driver.quit();
		
	}
	@Test
	public void  espaniollinkTest() {
		driver.findElement(By.linkText("Español")).click();
		//title validation== AssertEquals
		
		String actualTitle="Facebook - Inicia sesion o registrta";
		String expectedTitle=driver.getTitle();
		
		System.out.println("  Developers Title : " + expectedTitle );
		Assert.assertEquals(actualTitle,expectedTitle);
			
	}
	
	public void hindiLinkTest() {
		driver.findElement(By.linkText("हिन्दी")).click();
		
		String actualTitle="Facebook- में लॉग इन करें";
		String expectedTitle= driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);

		
		}
	}


