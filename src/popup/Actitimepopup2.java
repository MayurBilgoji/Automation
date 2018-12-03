package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitimepopup2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		
		driver.findElement(By.xpath("//div[.='Backup controlling']/../../..//div[@class='img']")).click();
		 driver.findElement(By.xpath("//span[.='Delete']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='deleteTaskPopup_deleteConfirm_cancelBtn']")).click();
	}

}
