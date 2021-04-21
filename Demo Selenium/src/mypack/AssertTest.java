package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	@Test
	public void verifyDefaultPage()
	{		
		String expectedpage = "face book";
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualpage =  driver.findElement(By.cssSelector("img[class*='fb_logo']")).getText();
		
		Assert.assertEquals(actualpage,  expectedpage,"page not varify ");
		
	}
}
