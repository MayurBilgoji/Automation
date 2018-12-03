package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaillog 
{    static
	{
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mayurbilgoji22@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("888413407666");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
	

	}

}
