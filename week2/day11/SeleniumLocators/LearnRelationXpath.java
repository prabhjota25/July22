package jul22.week2.day11.SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRelationXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		
		//parent to child relation xpath
		//TagName[@attribute='value']/child::tagname
		//driver.findElement(By.xpath("(//li[@style='width:100%;'])[4]/child::a")).click();
		
		//GrantParent to child relation xpath
		//TagName[@attribute='value']/descendant::tagname
		//driver.findElement(By.xpath("//ul[@class='menu']/descendant::a[4]")).click();
		
		//Parent to child relation xpath
		//TagName[@attribute='value']/parent::tagname
		//a[@title='JUnit']/parent::li
		//driver.findElement(By.xpath("a[@title='JUnit']/parent::li")).click();
		
		//Cousin to Following Cousin relation xpath
		//TagName[@attribute='value']/following::tagname
		//a[@title='Agile Testing']/following::a[2]
		driver.findElement(By.xpath("a[@title='Agile Testing']/following::a[2]")).click();
		
		//Sibling to Preceding Sibling relation xpath
		//TagName[@attribute='value']/preceding-sibling::siblingTagName[@attribute='value']
		//h4/preceding-sibling::a[@href='https://www.guru99.com/live-testing-project.html']
		
		//Sibling to Following Sibling relation xpath
		//https://demo.guru99.com/test/guru99home/
		//TagName[@attribute='value']/following-sibling::siblingTagName[@attribute='value']
		//a[@href='https://www.guru99.com/live-testing-project.html'])[2]/following-sibling::h4
		
		//GrandChild to FrandParent relation xpath
		//GrandChildTagName[@attribute='value']/ancestor::grandparentTagName
		////a[@title='Selenium']/ancestor::ul
		
			}

}
