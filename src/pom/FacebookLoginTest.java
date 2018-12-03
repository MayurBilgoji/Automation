package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest 
{

	public static void main(String[] args)
	{
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      FacebookLoginPage pg=new FacebookLoginPage(driver);
      pg.enterUserName("mayur");
      pg.enterPassword("123");
     
      pg.loginClick();
      
      
      pg.enterUserName("mayur");
      pg.enterPassword("123");
     
      pg.loginClick();
      
	}

}
