package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value=".\\drivers\\chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver f= new ChromeDriver();
		f.get("https://www.google.co.in/");
		f.navigate().to("https://www.gmail.com/");
		
		
		
		

	}

}
