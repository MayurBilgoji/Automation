package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggetion 
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
	Thread.sleep(1000);
	
	List<WebElement> alllist=driver.findElements(By.xpath("//a[@class='_2ja22P']"));
	int count=alllist.size();
	System.out.println("size is:"+count);
	for(int i=0;i<count;i++)
	{
		WebElement a=alllist.get(i);
		String b=a.getText();
		System.out.println(b);
	}

	}

}
