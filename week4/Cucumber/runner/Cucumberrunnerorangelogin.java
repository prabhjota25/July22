package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/loginorange.feature",
				 glue = "StepDefntn",
				 monochrome = true,
				 publish = true)
public class Cucumberrunnerorangelogin extends AbstractTestNGCucumberTests{

	
}
