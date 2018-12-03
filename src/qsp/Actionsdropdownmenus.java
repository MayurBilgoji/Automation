package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdropdownmenus
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://home.redbrickhealth.com/");
	    String xp="//a[.='RedBrick Health']/../..//a[.='Solutions']";
	    WebElement solutions=driver.findElement(By.xpath(xp));
	    
	    Actions act=new Actions(driver);
	    act.moveToElement(solutions).perform();
	    Thread.sleep(1000);
	    List<WebElement> we=driver.findElements(By.xpath("//a[@title='Solutions']/..//a[@class='nav-link']"));
	    int count=we.size();
	    System.out.println(count);
	    for(WebElement opt:we)
	    {
	    	String str=opt.getText();
	    	System.out.println(str);
	    }
	    //


	}

}
