package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("danager");
		lp.clickOnLogin();
		
		Thread.sleep(2000);
		lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickOnLogin();
	}

}
