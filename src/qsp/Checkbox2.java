package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox2 
{
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("file:///C:/Users/Asus/Desktop/checkbox.html");
	    driver.manage().window().maximize();
	 List<WebElement>allcheckbox =driver.findElements(By.xpath("//input[@type='checkbox']"));
	int count= allcheckbox.size();
	  System.out.println(count);
	  Thread.sleep(1000);
	  for(int i=count-1;i>0;i--)
	  {
		  WebElement box=allcheckbox.get(i);
		  box.click();
		  
	  }
	}

}
