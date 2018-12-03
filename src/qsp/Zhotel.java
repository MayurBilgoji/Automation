package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Zhotel 
{
	public static void main(String[] args) throws InterruptedException 
	{   System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Asus/Desktop/hotel.html");
		WebElement hotel=driver.findElement(By.xpath("//select"));
		Select sel=new Select(hotel);
	    sel.selectByIndex(2);
	    Thread.sleep(1000);
		sel.selectByValue("p");
		Thread.sleep(1000);
		sel.selectByVisibleText("Mutton");
		Thread.sleep(1000);
		sel.selectByVisibleText("Chicken");
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
