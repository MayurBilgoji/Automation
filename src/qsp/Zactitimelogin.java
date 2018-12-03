package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zactitimelogin 
{

	public static void main(String[] args)
	{
	 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.get("https://demo.actitime.com/login.do");
	 driver.findElement(By.id("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.xpath("//div[.='Login ']")).click();
	 
	 

	}

}
