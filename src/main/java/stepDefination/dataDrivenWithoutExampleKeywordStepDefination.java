package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dataDrivenWithoutExampleKeywordStepDefination {
	
	WebDriver driver;
	
	@Given("^twoadmin is on login page$")
	public void twoadmin_is_on_login_page(){
		
		System.setProperty("webdriver.chrome.driver","/home/nadsoft/AutomationSoftware/ChromrDriver/chromedriver"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dev.drive-on.com.au/login/");
	    
	}

	@When("^twoverify the URL$")
	public void twoverify_the_URL(){
	    
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://dev.drive-on.com.au/login/", url);  

	}

	@Then("^twoenter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void twoenter_and(String userName, String password){
	 
		driver.findElement(By.id("user_login")).sendKeys(userName);
		driver.findElement(By.id("user_pass")).sendKeys(password);
	}

	@Then("^twoclick on login button$")
	public void twoclick_on_login_button(){
	 
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
	}

	@Then("^twoverify the home page$")
	public void twoverify_the_home_page(){
	 
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://dev.drive-on.com.au/partners/my-dashboard/", url);
	}


}
