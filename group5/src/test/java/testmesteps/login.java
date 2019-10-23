package testmesteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class login {
	WebDriver driver;
	
	@Given("^user is on the TestmeApplogin page$")
	public void user_is_on_the_TestmeApplogin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\11772689\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.linkText("SignIn")).click();
		
	    //throw new PendingException();
	}

		
	
	@When("^user enters the username \"([^\"]*)\"$")
	public void user_enters_the_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		
	    //throw new PendingException();
	}

	@When("^user enters the password \"([^\"]*)\"$")
	public void user_enters_the_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys("Password123");
	    //throw new PendingException();
	}

	@Then("^user can do successful login$")
	public void user_can_do_successful_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
		
//		String act=driver.getTitle();
//		String act1="Home";
//		Assert.assertEquals(act1,act);
//		driver.findElement(By.linkText("act1")).click();
	   // throw new PendingException();
	}

}
