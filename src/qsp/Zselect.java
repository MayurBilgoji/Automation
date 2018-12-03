package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Zselect
{ 
	public static void main(String[] args)
{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/Asus/Desktop/new7.html");
		WebElement sel=driver.findElement(By.xpath("//select"));
		Select one=new Select(sel);
		one.selectByValue("m");
		one.selectByVisibleText("Apr");
		
	
}

}
