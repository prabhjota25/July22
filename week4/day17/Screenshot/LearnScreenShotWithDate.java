package jul22.week4.day17.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShotWithDate {
	public static void main(String[] args) throws IOException  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		
		//Step 1: Get the source screen shot as output file
		File sourceScreenShot = driver.getScreenshotAs(OutputType.FILE);
		
		Date date = new Date();
		
		String dateString = date.toString();
		
		String dateAndTime = dateString.replaceAll("[:, ]", "");
		
		//Step 2: Create a Target File
		File targetScreenShot = new File("./screenshot/guru99demosite "+dateAndTime+".jpg");
		
		//Step 3: Copy the Source to the Target
		FileUtils.copyFile(sourceScreenShot, targetScreenShot);
}
}
