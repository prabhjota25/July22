package jul22.week4.day17.AdvancedActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDropBy {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions action = new Actions(driver);
		//action.dragAndDropBy(sourceElement, 60, 60);
		action.dragAndDropBy(sourceElement, 60, 60).perform();
		
System.out.println("test");
	}

}
