package jul22.week2.day9.SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCloseAndQuit {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/close-browser-in-selenium");
		driver.manage().window().maximize();
		
	}
}
