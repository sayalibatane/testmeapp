package runners;



import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"json:target/cucumber.json"},
		features= {"C:\\11772689\\depo\\cucumbercase1\\Features\\case1.feature"},
glue= {"testmesteps"},
monochrome=true,
dryRun=false)

public class testmelogin {

	@Test
	public void test() {
	//	fail("Not yet implemented");
	}

}
