package Assignments;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpAssignment 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(2000);
		Set<String> allWH = driver.getWindowHandles();
		
		int count= allWH.size();
		List<String> allWHCopy= new ArrayList<String>(allWH);
		
		for(String wh:allWH)
		{
			System.out.println(driver.switchTo().window(wh).getTitle());
		}
		Thread.sleep(1000);
		
		/*
		//To close the specified window
		String pageTitle="WTW";
		for(String wh:allWH)
		{
			if(driver.switchTo().window(wh).getTitle().equals(pageTitle))
			{
				driver.close();
			}
		}
		
		driver.quit();
		*/
		
		
		
		
		//To close in reverse order
		for(int i=count-1;i>=0;i--)
		{
			Thread.sleep(1000);
			String wh= allWHCopy.get(i);
			//driver.switchTo().window(wh).close();
			driver.switchTo().window(allWHCopy.get(i)).close();
		}
		
		
		/*
		//To maximize the specified window
		String pageTitle="WTW";
		for(String wh:allWH)
		{
			
			if(driver.switchTo().window(wh).getTitle().equals(pageTitle))
			{
				driver.manage().window().maximize();
				break;
			}
			
		}
		*/
		/*
		//To verify if the specified window is present or not
		String pageTitle="Amazon";
		int found=-1;
		for(String wh:allWH)
		{
			if(driver.switchTo().window(wh).getTitle().equals(pageTitle))
			{
				found++;
			}
			
		}
		if(found>-1)
		{
			System.out.println("The specified window is present");
		}
		else
		{
			System.out.println("The specified window is not present");
		}
		driver.quit();
		 */
		
	/*	//To close only child browsers
		String pageUrl="https://www.naukri.com/";
		Thread.sleep(2000);
		for(String wh:allWH)
		{
			if(!(driver.switchTo().window(wh).getCurrentUrl().equals(pageUrl)))
			{
				Thread.sleep(2000);
				driver.close();
			}
			
		}
	*/	
	}
	
	

}
