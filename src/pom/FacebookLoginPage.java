package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginPage 
{
	//declaration
	@FindBy(id="email")
	private WebElement UserName;
	@FindBy(id="pass")
	private WebElement pwd;
	@FindBy(name="firstname")
	private WebElement firstName;
	@FindBy(name="lastname")
	private WebElement lastName;
	@FindBy( name="reg_email__")
	private WebElement mobNum;
	@FindBy(name="reg_passwd__")
	private WebElement newPassword;
	@FindBy(id="day")
	private WebElement bDate;
	@FindBy(id="month")
	private WebElement bMonth;
	@FindBy(id="year")
	private WebElement bYear;
	@FindBy(xpath="//input[@value='1']")
	private WebElement sexFemale;
	@FindBy(xpath="//input[@value='2']")
	private WebElement sexMale;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBtn;
	
	//intialization
	public FacebookLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void enterUserName(String us)
	{
	UserName.sendKeys(us);
	}
	public void enterPassword(String us)
	{
		pwd.sendKeys(us);
	}
	public void enterFirstname(String us)
	{
		firstName.sendKeys(us);
	}
	public void enterlastname(String us)
	{
		lastName.sendKeys(us);
	}
	public void enterMobno(String us)
	{
		mobNum.sendKeys(us);
	}
	public void enterNewPass(String us)
	{
		newPassword.sendKeys(us);
	}
	public void enterDate(String us)
	{   
		Select sel=new Select(bDate);
		sel.selectByValue(us);
	}
	public void enterMonth(String us)
	{  
		Select sel=new Select(bMonth);
	    sel.selectByVisibleText(us);
	}
	public void enterYear(String us)
	{
		Select sel=new Select(bYear);
	    sel.selectByVisibleText(us);
	}
	public void enterFemale()
	{
		sexFemale.click();
	}
	public void enterMale()
	{
	   sexMale.click();	
	}
	public void loginClick()
	{
		loginBtn.click();
	}
}
