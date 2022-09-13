package jul22.week4.day17.AdvancedActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMoveToElement {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://athleta.gapcanada.ca/?ssiteID=ON");
		driver.manage().window().maximize();
		
	WebElement sleep = driver.findElement(By.linkText("Sleep"));
		
		
	//	WebElement men = driver.findElement(By.linkText("Men"));
		Actions action = new Actions(driver);
		action.moveToElement(sleep).perform();
		driver.findElement(By.xpath("//span[text()='All Sleep & Lounge']")).click();

	}

}
