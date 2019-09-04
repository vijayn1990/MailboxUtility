package Extras;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddingDynamicElementsInWebpage 
{
		static
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			
		}
		public static void main(String[] args) throws InterruptedException 
		{
			//WebDriver driver= new ChromeDriver();
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Vijay/Documents/Testing Course/Automation/WebPages/Adding_dynamic_element_in_webpage.html");
			
			Thread.sleep(2000);
			WebElement btn1 = driver.findElement(By.xpath("//button[.='Try it']"));
			btn1.click();
			Thread.sleep(2000);
			btn1.click();
			Thread.sleep(2000);
			
			WebElement btn3 = driver.findElement(By.xpath("//button[.='Delete Para']"));
			btn3.click();
			Thread.sleep(2000);
			
			
			
			
			
			
			//Thread.sleep(3000);
			
			
			
			//Thread.sleep(3000);
			driver.close();
		
		}
}

