import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open the website
		String url = "https://smartbytes.v-logics.com/ocart/index.php?route=common/home";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sushanth\\Desktop\\Sushanth\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		delay();
		// click on create an account
		driver.findElement(By.xpath("//*[@id=\"welcome\"]/a[2]")).click();
		delay();
		// Fill Personal Detaiils
		driver.findElement(By.name("firstname")).sendKeys("Sushanth");
		driver.findElement(By.name("lastname")).sendKeys("vick");
		driver.findElement(By.name("email")).sendKeys("sushanth019@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("1234567890");

		// Fill Address
		driver.findElement(By.name("address_1")).sendKeys("hairan Galli");
		driver.findElement(By.name("city")).sendKeys("pareshan road");
		driver.findElement(By.name("postcode")).sendKeys("123490");

		WebElement country = driver.findElement(By.name("country_id"));
		Select countrySelection = new Select(country);
		countrySelection.selectByValue("16");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		delay();

		WebElement region = driver.findElement(By.name("zone_id"));
		Select regionSelection = new Select(region);
		regionSelection.selectByValue("285");

		// Fill Password
		driver.findElement(By.name("password")).sendKeys("india");
		driver.findElement(By.name("confirm")).sendKeys("india");

		delay();

		// Select Newsletter
		List<WebElement> subscribe = driver.findElements(By.name("newsletter"));
		subscribe.get(1).click();
		delay();

		// Click on agree terms & Conditions
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/input[1]")).click();
		delay();

		// Finally Click continue.
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/input[2]")).click();

	}

	public static void delay() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
