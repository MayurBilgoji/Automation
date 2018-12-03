package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zismultiple 
{
	public static void main(String[] args) 
	{   
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Desktop/hotel.html");
		WebElement hotel=driver.findElement(By.id("maarya"));
		Select sel=new Select(hotel);
		if(sel.isMultiple())
		{
			System.out.println("multi");
		}
		else
		{
			System.out.println("single");
		}
		
		
	}

}
