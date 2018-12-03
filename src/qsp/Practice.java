package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice
{   
	public static void main(String[] args)
	{   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//to maximize
		driver.manage().window().maximize();
		//to enter url
		driver.get("https://www.google.com/");
		//to get title of webpage
		String title=driver.getTitle();
		System.out.println("title="+title);
		//to get current url
	    String url=driver.getCurrentUrl();
	    System.out.println("url="+url);
	    //to open another
	    driver.navigate().to("https://www.facebook.com");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
		
	}

}
