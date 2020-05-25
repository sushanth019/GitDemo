package src.pomObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

	public static void main(String[] args) {
		pomTestClass loginpage = new pomTestClass();
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sushanth\\Desktop\\Sushanth\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smartbytes.v-logics.com/ocart/index.php?route=account/login");
		loginpage.pomTestClass(driver);
		loginpage.performLogin("sushanth019@gmail.com", "12345678");
		
	}

}
