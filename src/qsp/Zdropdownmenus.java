package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zdropdownmenus 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://home.redbrickhealth.com/");
	    String xp="//a[.='RedBrick Health']/../..//a[.='About Us']";
	    WebElement aboutus=driver.findElement(By.xpath(xp));
	    
	    Actions act=new Actions(driver);
	    act.moveToElement(aboutus).perform();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[.='Company']")).click();

	}

}
