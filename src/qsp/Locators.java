package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Asus/Desktop/new2.html");
		//By using id 
		driver.findElement(By.id("fp")).click();
		driver.navigate().back();
		//by using name
		driver.findElement(By.name("forgot")).click();
		driver.navigate().back();
		//by using class names
		driver.findElement(By.className("pass")).click();
		driver.navigate().back();
		
	}

	

}
