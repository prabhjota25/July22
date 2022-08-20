package jul22.week2.day12.AdditionalElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCloseAndQuit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		String text = driver.findElement(By.className("barone")).getText();
		System.out.println(text);
		
		//driver.close() -> Only closes the window currently active and not the browser session or other windows within the browser session
		//driver.close();
		
		//driver.quit() -> Closes all the window in the browser session
		driver.quit();
		

	}

}
