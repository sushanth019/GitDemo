package src.pomRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	private WebDriver driver;
	
	//Firstname
	@FindBy(name = "firstnanme")
	private WebElement txtfirstname;
	
	//lastname
	@FindBy(name = "lastname")
	private WebElement txtLastname;
	
	
	//email
	@FindBy(name = "email")
	private WebElement txtEmail;
	
	//telephone
	@FindBy(name = "telephone")
	private WebElement txtTelephone;
	
	//address1
	@FindBy(name = "address_1")
	private WebElement txtAddress1;
	
	//city
	@FindBy(name = "city")
	private WebElement txtCity;
	
	//postcode
	@FindBy(name = "postcode")
	private WebElement txtPostcode;
	
	//country
	@FindBy(name = "country_id")
	private WebElement txtCountry;
	
	//region
	@FindBy(name = "zone_id")
	private WebElement txtRegion;

	
	//password
	@FindBy(name = "password")
	private WebElement txtPassword;
	
	//confirm password
	@FindBy(name = "confirmPassword")
	private WebElement txtPasswordConfirm;
	
	//agree button
	@FindBy(name = "agree")
	private WebElement txtAgree;
	
	//button
	@FindBy(xpath = "//*[@id=\"content\"]/form/div[5]/div/input[2]")
	private WebElement btn;
	public void registration(WebDriver webdriver)
	{
		this.driver = webdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void textDetails(String firstname, String lastname, String email, String telephone, String adress, String city, String postcode, String country, String region, String password, String confirm )
	{
		txtfirstname.sendKeys(firstname); 
		txtLastname.sendKeys(lastname);
		txtEmail.sendKeys(email);
		txtTelephone.sendKeys(telephone);
		txtAddress1.sendKeys(adress);
		txtCity.sendKeys(city);
		
		txtCountry.sendKeys(country);
		Select element = new Select(txtCountry);
		element.selectByValue("country");
		
		
		txtPostcode.sendKeys(postcode);
		
		
		txtRegion.sendKeys(region);
		Select regionid = new Select(txtRegion);
		regionid.selectByValue("region");
		txtPassword.sendKeys(password);
		txtPasswordConfirm.sendKeys(confirm);
		txtAgree.click();
		delay();
		btn.click();
		
	}
	
	public void delay()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
