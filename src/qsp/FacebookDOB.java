package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOB
{

	public static void main(String[] args) 
	{  
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
      WebElement day= driver.findElement(By.id("day"));
       Select sel=new Select(day);
       sel.selectByValue("18");
       WebElement month=driver.findElement(By.id("month"));
       Select del=new Select(month);
       del.selectByValue("4");
       WebElement year=driver.findElement(By.id("year"));
       Select fel=new Select(year);
       fel.selectByValue("1996");
       
     }

}
