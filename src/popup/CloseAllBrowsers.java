package popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowsers 
{

	public static void main(String[] args) throws InterruptedException 
	{   
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com/");
		Set<String> allWH=driver.getWindowHandles();
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
			driver.close();
			Thread.sleep(1000);
		}
		
		
		 
	}

}
