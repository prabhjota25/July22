package jul22.week2.day10.SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLocatorClassName {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		String text = driver.findElement(By.className("barone")).getText();
		System.out.println(text);

	}

}
