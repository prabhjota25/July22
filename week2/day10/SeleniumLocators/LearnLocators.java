package jul22.week2.day10.SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnLocators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("btnLogin")).click();
		
		//String output = driver.findElement(By.id("message9")).getText();
		String output = driver.findElement(By.cssSelector("#message9")).getText();
		
		System.out.println(output);
		if (output.equals("Email_ID must not be blank"))

		{
			System.out.println("Result is as expected - Pass: " + output);
		}
		
		else
		{
			System.out.println("Result is as note expected - Fail" + output);
		}
		
		driver.findElement(By.name("emailid")).sendKeys("test@test.com");
		driver.findElement(By.name("btnLogin")).click();
	}

}
