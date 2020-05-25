import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testFb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Accessing the website
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushanth\\Desktop\\Sushanth\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverEement = new ChromeDriver();
		driverEement.get("https://www.facebook.com");
		
		//Test Text box
		driverEement.findElement(By.name("firstname")).sendKeys("Shikar");
		driverEement.findElement(By.name("lastname")).sendKeys("dhawan");
		driverEement.findElement(By.name("reg_email__")).sendKeys("dhawan.shikar21@gmail.com");
		driverEement.findElement(By.name("reg_passwd__")).sendKeys("dhawan");
		
		//Test radio Buttons
		WebElement birth = driverEement.findElement(By.name("birthday_day"));
		Select birthdate = new Select(birth);
		birthdate.selectByValue("30");
		
		birthdate.selectByVisibleText("Jun");
	
		
		//Test Checkboxes
		//Test Buttons

	}

}
