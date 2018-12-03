package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com/");
		String pwH=driver.getWindowHandle();
		Set<String> allWH=driver.getWindowHandles();
		allWH.remove(pwH);
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
			driver.close();
			Thread.sleep(1000);
		}
		driver.switchTo().window(pwH);
	}

}
