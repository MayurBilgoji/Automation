package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Facebook1 {

	public static void main(String[] args) throws InterruptedException 
	{
	    String key="webdriver.gecko.driver";
	     String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("raghu");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("raghu");
		driver.findElement(By.cssSelector("input[id='u_0_o']")).sendKeys("123456789");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1990");
		  driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jun");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("20");
		driver.findElement(By.cssSelector("input[value='1']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("input[value='2']")).click();+


		
	   

	}

}
