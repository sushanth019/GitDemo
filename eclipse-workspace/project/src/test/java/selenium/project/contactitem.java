package selenium.project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class contactitem {
	WebDriver driver = null;
	@BeforeTest
	public void initalization() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sushanth\\Desktop\\Sushanth\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rambabu.ca");
	}
		@Test
		public void contact()
		{
			
			Actions action = new Actions(driver);
			WebElement contactItem = driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a"));
			action.moveToElement(contactItem).build().perform();
			action.moveToElement(contactItem).click().build().perform();
			
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> parent = ids.iterator();
			String parentWindow = parent.next();
			
			delay();
			driver.switchTo().window(parentWindow);
			driver.findElement(By.xpath("//*[@id=\"contact\"]/div[2]/div/div[2]/div[3]/a[1]")).click();
			delay();
			driver.switchTo().window(parentWindow);
			driver.findElement(By.xpath("//*[@id=\"contact\"]/div[2]/div/div[2]/div[3]/a[2]")).click();
			delay();
			driver.switchTo().window(parentWindow);
			driver.findElement(By.xpath("//*[@id=\"contact\"]/div[2]/div/div[2]/div[3]/a[3]")).click();
			delay();
			driver.switchTo().window(parentWindow);
			driver.findElement(By.xpath("//*[@id=\"contact\"]/div[2]/div/div[2]/div[3]/a[4]")).click();
			delay();
			driver.switchTo().window(parentWindow);
			driver.findElement(By.xpath("//*[@id=\"contact\"]/div[2]/div/div[2]/div[3]/a[5]")).click();
			delay();
			driver.switchTo().window(parentWindow);
			driver.findElement(By.xpath("//*[@id=\"contact\"]/div[2]/div/div[2]/div[3]/a[6]")).click();
			delay();
			driver.switchTo().window(parentWindow);
			driver.quit();
		}
		


	
	
	public static void delay() {
		try {
			// logger.info("This is a delay method to see the test cases being automated");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
