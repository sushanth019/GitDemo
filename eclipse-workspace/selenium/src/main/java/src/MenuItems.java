package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MenuItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://smartbytes.v-logics.com/ocart/index.php?route=common/home";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sushanth\\Desktop\\Sushanth\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//Menu Items
		Actions items = new Actions(driver);
		WebElement desktp = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a"));
		items.moveToElement(desktp).build().perform();
		delay();
		WebElement Ln = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a"));
		items.moveToElement(Ln).build().perform();
		delay();
		WebElement components = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a"));
		items.moveToElement(components).build().perform();
		delay();
		WebElement tablets = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a"));
		items.moveToElement(tablets).build().perform();
		delay();
		WebElement subItem = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/div/ul/li[2]/a"));
		items.moveToElement(tablets).click(subItem).build().perform();
		
	}
	
	public static void delay()
	{
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
