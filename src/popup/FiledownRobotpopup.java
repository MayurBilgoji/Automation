package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiledownRobotpopup 
{  
	
	public static void main(String[] args) throws AWTException, InterruptedException 
{
	 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://www.seleniumhq.org/download");
	 String xp="//td[.='Java']/..//a[.='Download']";
	 driver.findElement(By.xpath(xp)).click();
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_ALT);
	 r.keyPress(KeyEvent.VK_S);
	 Thread.sleep(2000);
	 r.keyRelease(KeyEvent.VK_ALT);
	 r.keyRelease(KeyEvent.VK_S);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	
	 
}
}
