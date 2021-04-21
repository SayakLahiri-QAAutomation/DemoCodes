package SeleniumDemo;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.ui.Select;



public class SeleniumProject {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		Thread.sleep(3000);
		
		for(int i=1; i<=5; i++)
		{
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(200);
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		/*
		
		for(int i=1; i<=4; i++) {
			
			webElement element = driver.findElement(By.xpath());
		}
		
		*/
		
		WebElement element = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[4]/div[1]/span[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
		Thread.sleep(3000); 
		
		
		WebElement element1 = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[4]/div[1]/span[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]"));
		File srcFile = element1.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(srcFile,new File("D:\\Selenium\\Screenshots\\image1.jpg"));
		JOptionPane.showMessageDialog(null, "Screen shot taken successfully");
		driver.quit();
	}

}


