package cucumberoption;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature",
glue="stepDefinition",tags="",
plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"},
monochrome=true
)
public class Runner  extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)//it save half time
     public Object[][]scenarios(){
	   return super.scenarios();
   }
	
}  