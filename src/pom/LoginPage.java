package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	//declaration
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		unTB=driver.findElement(By.id("username"));
		System.out.println(unTB);
		pwTB=driver.findElement(By.name("pwd"));
		System.out.println(pwTB);
		loginBTN=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	//utilization
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
		
	}
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	
}
