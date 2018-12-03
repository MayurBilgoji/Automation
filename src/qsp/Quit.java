package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to max window
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.quit();//quit is used to close all the browsers
	}

}
