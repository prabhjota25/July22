package jul22.week4.day17.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShotOfElement {
	
		public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		
		WebElement submit = driver.findElement(By.name("btnLogin"));
		
		//Step 1: Get the source screen shot as output file
				//File sourceScreenShot = driver.getScreenshotAs(OutputType.FILE);
				File sourceScreenShot = submit.getScreenshotAs(OutputType.FILE);
				
				//Step 2: Create a Target File
				File targetScreenShot = new File("./screenshot/submit1.jpg");
				
				//Step 3: Copy the Source to the Target
				FileUtils.copyFile(sourceScreenShot, targetScreenShot);
		
		
		
		
		

	}
}
