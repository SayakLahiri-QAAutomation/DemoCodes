package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstselprj {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//driver.manage().window().maximize()
		
		driver.get("google.com");
		driver.manage().window().maximize();
		/*
		driver.manage().window().maximize();
		driver.findElement(By.id("")).sendKeys("");
		Thread.sleep(0);
		
		
		
		
		driver.findElement(By.id("")).sendKeys(Keys.ENTER);
		Thread.sleep(0);
		driver.close();
		*/
	}
}