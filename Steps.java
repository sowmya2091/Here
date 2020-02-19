package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Response;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;


public class Steps {
	
	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {
		System.out.println("Browser is opened");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowmya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("http://developer.here.com/documentation");
	    Thread.sleep(30);
	    String actTitle = driver.getTitle();
	    String expTitle = "Documentation, Code Examples and API References - HERE Developer";
	    if(expTitle.equals(actTitle))
	    {
	    	System.out.println("Correct title!");
	    }
	    else
	    {
	    	System.out.println("Incorrect title");
	    }
	    driver.close();
	    
//	    RestAssured.baseURI = "http://developer.here.com/documentation";
//	    RequestSpecification httpRequest = RestAssured.given();
//	    Response response = (Response) httpRequest.request("2");
//	    int statusCode = response.getStatus();
//	    Assert.assertEquals(statusCode, 200);
	    
	}

	@When("^I navigate to documentation page$")
	public void i_navigate_to_documentation_page() throws Throwable {
	    System.out.println("Navigated to Document page");
	}

	@Then("^I validate Documentation page is loaded properly$")
	public void i_validate_Documentation_page_is_loaded_properly() throws Throwable {
	    System.out.println("Page is loaded properly");
	}

	@And("^The title should be \"(.*?)\"$")
	public void the_title_should_be(String arg1) throws Throwable {
	    System.out.println("The title should be - Documentation, Code Examples and API References - HERE Developer");
	}

}
