package pomObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTestClass {
	//using pom objects testing the login page
	private WebDriver driver; 
	
	//Email
	@FindBy(name = "email")
	private WebElement txtemail;
	
	//Password
	@FindBy(name ="password")
	private WebElement txtpassword;
	
	//Login button
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/form/div/input[3]")
	private WebElement loginBtn;
	
	//Constructor
	public void pomTestClass(WebDriver webDriver)
	{
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}
	
	public void performLogin(String email, String password)
	{
		txtemail.sendKeys(email);
		txtpassword.sendKeys(password);
		loginBtn.click();
	}
}

