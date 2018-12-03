package qsp;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class demo2 
{
	public static void main(String[] args)
    {
		String key="webdriver.ie.driver";
		String value="./drivers/IEDriverServer.exe";
		System.setProperty(key, value);
		InternetExplorerDriver e= new InternetExplorerDriver();
		
		
		
	}

}
