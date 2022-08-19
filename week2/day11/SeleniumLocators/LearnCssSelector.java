package jul22.week2.day11.SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCssSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input#input")).sendKeys("hi welcome");
		
		String text = driver.findElement(By.cssSelector("h1.thick-heading")).getText();
		System.out.println(text);

	}

}
