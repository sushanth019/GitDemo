package pomRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testPomclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegistrationPage element = new RegistrationPage();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sushanth\\Desktop\\Sushanth\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smartbytes.v-logics.com/ocart/index.php?route=account/register");
		
		element.registration(driver);
		
		element.textDetails("Sushik", "Kulkarni", "sushik@123.com", "1234567890", "Hairan Galli", "pareshan road", "123456", "14", "192", "1234567", "1234567");
	}

}
