package stepDefination;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefination {
	
	WebDriver driver;
	
	@Given("^admin is on login page$")
	public void admin_is_on_login_page(){
		
		System.setProperty("webdriver.chrome.driver","/home/nadsoft/AutomationSoftware/ChromrDriver/chromedriver"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dev.drive-on.com.au/login/");
	}
	
	@When("^verify the URL$")
	public void verify_the_URL(){
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://dev.drive-on.com.au/login/", url);    
	}
	
	@Then("^enter username and password$")
	public void enter_username_and_password(){
		
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("Wedriveon16!");
	}
	
	@Then("^click on login button$")
	public void click_on_login_button(){
	 
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
	}
	
	@Then("^verify the home page$")
	public void verify_the_home_page(){
	    
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://dev.drive-on.com.au/partners/my-dashboard/", url);
	}

}
