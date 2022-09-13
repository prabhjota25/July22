package jul22.week4.day17.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShot {
	
	public static ChromeDriver driver;
	public void screenShot() throws IOException {
		
		//Step 1: Get the source screen shot as output file
				File sourceScreenShot = driver.getScreenshotAs(OutputType.FILE);
				
				
				//Step 2: Create a Target File
				File targetScreenShot = new File("./screenshot/guru99demosite1.jpg");
				
				//Step 3: Copy the Source to the Target
				FileUtils.copyFile(sourceScreenShot, targetScreenShot);
	}

	public static void main(String[] args) throws IOException  {
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		
		
		  LearnScreenShot sh = new LearnScreenShot(); 
		  sh.screenShot();

	}

}
