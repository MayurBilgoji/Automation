package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivpopup 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.cleartrip.com/");
    driver.findElement(By.id("DepartDate")).click();
    String xp="//span[.='November']/../../..//a[.='26']";
    driver.findElement(By.xpath(xp)).click();
    
	
}
}
