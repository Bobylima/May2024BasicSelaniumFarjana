package webDriverCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HowToOpenBrowserAndApplication {
	WebDriver driver;
@Test
	public void openapplicationWithChrome() {
	
	//how do you open a chrome browser
	 driver= new ChromeDriver();
	 
	//how do you open an application
		driver.get("https://www.facebook.com/");
		//how do you close browser
		driver.close();
	}
@Test
	
public void openApplicationWithEdge() {
	driver=new EdgeDriver();
	//how do you open a edge browser
	driver.get("https://www.amazon.com/");
	driver.close();
}
	
	
}
