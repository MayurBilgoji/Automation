package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitimepopup1 
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.get("https://demo.actitime.com/login.do");
	 driver.findElement(By.id("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.xpath("//div[.='Login ']")).click();
	 Thread.sleep(10000);
	 driver.findElement(By.xpath("//div[@class='popup_menu_icon support_icon']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
	 Thread.sleep(2000);
	 WebElement element=driver.findElement(By.xpath("//span[.='(build 40469)']"));
	String s= element.getText();
	System.out.println(s);
	 
	 
	 

	}

}
