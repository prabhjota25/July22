package jul22.week2.day12.AdditionalElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRadioButton {	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		WebElement radiobutton1 = driver.findElement(By.xpath("(//input[@name='webform'])[1]"));
		WebElement radiobutton2 = driver.findElement(By.xpath("(//input[@name='webform'])[2]"));
		WebElement radiobutton3 = driver.findElement(By.xpath("(//input[@name='webform'])[3]"));
		
		for (int i=1; i<=3; i++)
		{
		
			if(i==1)
			{
			radiobutton1.click();
			}
			
			else if(i==2)
			{
				radiobutton2.click();
			}
			
			else
			{
				radiobutton3.click();
			}
		boolean rb1 = radiobutton1.isSelected();
		boolean rb2 = radiobutton2.isSelected();
		boolean rb3 = radiobutton3.isSelected();
		if(rb1 == true)
		{
			System.out.println("RadioButton1 is selected");
		}
		
		else if(rb2 == true)
		{
			System.out.println("RadioButton2 is selected");
		}
		
		else
		{
			System.out.println("RadioButton3 is selected");
		}
		
		}
	}
}
