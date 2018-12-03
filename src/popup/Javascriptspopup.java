package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptspopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
	      driver.findElement(By.id("loginbutton")).click();
	      Alert a=driver.switchTo().alert();
	      Thread.sleep(1000);
	      String text=a.getText();
	      System.out.println(text);
	      a.accept();
		
	}

}
