package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\sanjaygajelli\\eclipse-workspace\\leena\\Feature\\login.feature",
glue={"stepDefination"})	
public class runner {

}
