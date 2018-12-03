package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4
{
	public static void main(String[] args) throws InterruptedException 
	{   //to open the browser
		String key="webdriver.chrome.driver";
		String value=".\\drivers\\chromedriver.exe";
		System.setProperty(key, value);
		//upcasting 
		WebDriver driver= new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to enter url
		driver.get("https://www.google.co.in/");
		//to get the title of the webpage
		String title=driver.getTitle();
		System.out.println(title);
		//TO Get url of current webpage
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//to close the browser
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
