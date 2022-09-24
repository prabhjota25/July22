package StepDefntn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrangeHRM {

	public static ChromeDriver driver;
	
	@Given ("User opens the browser")
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
	}
	
	@Given ("Access the valid url")
	public void accessURL()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Given ("Enter valid username {string}")
	public void validUserName(String uname)
	{
		driver.findElement(By.name("username")).sendKeys(uname);
	}
	
	@Given ("Enter valid password {string}")
	public void validPassword(String pword) {
		driver.findElement(By.name("password")).sendKeys(pword);
	}
	
	@When ("Click the Login buttons")
	public void clickLogin()
	{
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
	
	@Then ("OrangeHRM PIM page is displayed")
	public void pimPage()
	{
		String text = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		if (text == "PIM")
			System.out.println("Pass");
	}
	
	@Given ("Enter invalid password {string}")
	public void invalidPassword(String pword)
	{
		driver.findElement(By.name("password")).sendKeys(pword);
	}
	
	@But ("Error Invalid Credential displayed")
	public void invalidCredential()
	{
		String error = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
		if (error=="Invalid credentials")
		{
			System.out.println("Error message displayed");
		}
	}
}
