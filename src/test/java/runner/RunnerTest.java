package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature File"
,glue="stepDefination"
,monochrome=true
,publish=true
,plugin= {"pretty","json:target/JsonReports/cucumberjsonreport.json"
	,"json:target/HtmlReports/cucumberhtmlreports.html"	})

public class RunnerTest {

}
