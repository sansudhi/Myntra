package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untbox;

	@FindBy(name="pwd")
	private WebElement pwdtbox;	

	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;

	public LoginPage(WebDriver driver)
	{
	 	PageFactory.initElements(driver, this);
	}

	public void setUsername(String un)
	{
		untbox.sendKeys(un);
	}

	public void setPassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}

	public void clickLogin()
	{
		loginbtn.click();
	}


}
