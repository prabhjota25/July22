package jul22.week2.day12.AdditionalElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@name='webform'])[4]"));
		WebElement checkbox2 = driver.findElement(By.xpath("(//input[@name='webform'])[5]"));
		WebElement checkbox3 = driver.findElement(By.xpath("(//input[@name='webform'])[6]"));
		
		for (int i=0; i<2; i++)
		{
			checkbox1.click();
			boolean cb1 = checkbox1.isSelected();
			if(cb1== true)
				{
						System.out.println("checkbox1 is selected");
				}
			
			else
			{
				System.out.println("checkbox1 is not selected");
			}
			
			checkbox2.click();
			boolean cb2 = checkbox2.isSelected();
			if(cb2== true)
				{
						System.out.println("checkbox2 is selected");
				}
			
			else
			{
				System.out.println("checkbox2 is not selected");
			}
		}
		
		checkbox3.click();
		boolean cb3 = checkbox3.isSelected();
		if(cb3== true)
			{
					System.out.println("checkbox3 is selected");
			}
		
		else
		{
			System.out.println("checkbox3 is not selected");
		}

	}

}
