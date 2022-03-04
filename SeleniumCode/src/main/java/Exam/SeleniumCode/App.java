package Exam.SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	WebDriver driver;
	
	public void launchBrowser()  
	
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/nikhi/Downloads/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
			
	}


	public void navigate() throws InterruptedException
	{
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		
	 	System.out.println("This is the title of the website" + driver.getTitle());
	 	driver.findElement(By.className("@class='__2IX_2- VJZDxU'")).sendKeys("testuser@xyz.com");
	 	driver.findElement(By.xpath("//div[@class='_2IX_2- _3mctLh VJZDxU']//form//input[@type='password']")).sendKeys("Test@99");
	 	driver.findElement(By.className("@class='_2YsvKq o8qAfl'")).click();
	 	
	 	driver.close();
	}

	public void closebrowser() 
	{
		driver.quit();
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
	
		App ob = new App();
	
		ob.launchBrowser();
	
		ob.navigate();
		
		ob.closebrowser();
	}

}
