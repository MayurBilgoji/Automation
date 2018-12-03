package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("mayur123bilgoji@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("88841340766");
		driver.findElement(By.cssSelector(" input[type='submit']")).click();
		//driver.findElement(By.cssSelector("input [type='text']")).sendKeys("mayur");
				
		
	}

}
