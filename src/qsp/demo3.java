package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("entr the browser");
        String browser=sc.nextLine();
        WebDriver driver=null;
        if(browser.equals("ff"))
        {
         String key="webdriver.gecko.driver";
	     String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
		driver=new FirefoxDriver(); 
        	
        }
        else
        if(browser.equals("gc"))
        {
        String key="webdriver.chrome.driver";
		String value=".\\drivers\\chromedriver.exe";
		System.setProperty(key, value);
		driver= new ChromeDriver();
        	
        }
        Thread.sleep(1000);
        driver.close();
	}

}
