import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Table {

	public static void main(String[] args) {
		String url = "https://smartbytes.v-logics.com/ocart/table.html";

		// Open the Website
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sushanth\\Desktop\\Sushanth\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		// Selecting the rows number of list to 25
				Select rowElements =  new Select(driver.findElement(By.name("example_length")));
				rowElements.selectByValue("25");

		//Find out number of rows
		List<WebElement> rowIndex = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr"));
		int rowSize = rowIndex.size();
		System.out.println(rowSize);
		
		
		
		//Find out number of columns
		List<WebElement> columnIndex = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td"));
		int columnSize = columnIndex.size();
		System.out.println(columnSize);
		
		//Use for loop to get a list by using row and coloumn
		WebElement element = null;
		for(int row =1; row<= rowSize; row++) 
		{
			for(int column =1; column<= columnSize; column++)
			{
				element = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+row+"]/td["+column+"]"));
				System.out.print(element.getText() + "\t");
			}
			System.out.println("");
			
		}
		System.out.println("");
		
		
		
		
		/*
		// Testing the table by retrieving the values in the table
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]"));

		Select rowElements =  new Select(driver.findElement(By.name("example_length")));
		rowElements.selectByValue("25");
		WebElement columnElement = null;
		for (int row = 1; row <= 22; row++) {
			for (int column = 1; column <= 6; column++) {
				columnElement = driver
						.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[" + row + "]/td[" + column + "]"));
				System.out.print(columnElement.getText()+"\t");
			}
			System.out.println("\t");
		}
		System.out.println("");

		
		//Search people who live in london
		driver.findElement(By.cssSelector("#example_filter > label > input[type=search]")).sendKeys("London");
		// separte people by age
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"example\"]/thead/tr/th[4]")).click();
		*/
	}
	

}
