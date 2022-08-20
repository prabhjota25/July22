package jul22.week2.day12.AdditionalElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDownMenu {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select objSelect = new Select(country);
		objSelect.selectByIndex(4);
		
		objSelect.selectByValue("ECUADOR");
		
		objSelect.selectByVisibleText("EGYPT");
		
		//objSelect.selectByIndex(0);
		
		
	}

}
