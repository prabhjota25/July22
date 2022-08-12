package jul22.week2.day9.SeleniumIntro;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		//Download the ChromeDriver.exe and setup the path
		WebDriverManager.chromedriver().setup();
		
		//Open the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Enter the URL "https://demo.guru99.com/"
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		
		
		//Options manage = driver.manage();
		//Window window = manage.window();
		//window.maximize();
		
		//Download the FireFox.exe and setup the path
		//WebDriverManager.firefoxdriver().setup();
		//Open the FireFox Browser
		//FirefoxDriver driver1 = new FirefoxDriver();
		//driver1.get("https://demo.guru99.com/");
		
		
		//Download the IEdriver.exe and setup the path
		//WebDriverManager.iedriver().setup();
		
		//Download the IEdriver.exe and setup the path
		//WebDriverManager.edgedriver().setup();
				
	}

}
