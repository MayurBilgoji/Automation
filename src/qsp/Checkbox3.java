package qsp;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox3
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}

	public static void main(String[] args)
	{
	  WebDriver driver=new FirefoxDriver();
	  driver.get("file:///C:/Users/Asus/Desktop/checkbox.html");
	  driver.manage().window().maximize();
	  java.util.List<WebElement> allcheckbox =driver.findElements(By.xpath("//input[@type='checkbox']"));
	int count= allcheckbox.size();
	  System.out.println(count);
	  for(int i=0;i<count;i++)
	  {
		  WebElement box=allcheckbox.get(i);
		  if(i%2==1)
		  {
		  box.click();
		  }
	  }
	  
	  

	}

}