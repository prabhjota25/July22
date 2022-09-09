package jul22.week4.day16.WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		

	}

}
