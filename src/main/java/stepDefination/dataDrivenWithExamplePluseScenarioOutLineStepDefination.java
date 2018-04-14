package stepDefination;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dataDrivenWithExamplePluseScenarioOutLineStepDefination {
	
	WebDriver driver;
	
	@Given("^threeadmin is on login page$")
	public void threeadmin_is_on_login_page(){

		System.setProperty("webdriver.chrome.driver","/home/nadsoft/AutomationSoftware/ChromrDriver/chromedriver"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dev.drive-on.com.au/login/");
	}

	@When("^threeverify the URL$")
	public void threeverify_the_URL(){
	
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://dev.drive-on.com.au/login/", url);    
	}

	@Then("^threeenter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void threeenter_and(String username, String password){
		
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
	}

	@Then("^threeclick on login button$")
	public void threeclick_on_login_button(){
		
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
	}

	@Then("^threeverify the home page$")
	public void threeverify_the_home_page(){
	    
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://dev.drive-on.com.au/partners/my-dashboard/", url);
	}

	@Then("^click on add new referral link$")
	public void click_on_add_new_referral_link() throws InterruptedException{
		
		//click on referral
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[2]/a")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[2]/ul/li[2]/a")).click();
	}

	@Then("^enter referral details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_referral_details_and_and_and(String fName, String lName, String email, String telephone) throws InterruptedException, AWTException{
	   
		driver.findElement(By.id("first_name")).sendKeys(fName);
		driver.findElement(By.id("last_name")).sendKeys(lName);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("phone")).sendKeys(telephone);
		
		//select partner drop
		driver.findElement(By.xpath(".//*[@id='create_referral']/div/div/div[2]/div[8]/div/button")).click();
		Thread.sleep(300);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(300);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(300);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		
		//stage 
		driver.findElement(By.xpath(".//*[@id='create_referral']/div/div/div[2]/div[9]/div/button")).click();
		Thread.sleep(300);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(300);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(300);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
	}

	@Then("^click on submit referral button$")
	public void click_on_submit_referral_button() throws InterruptedException{
		
		driver.findElement(By.xpath(".//*[@id='submit_btn']")).click();
		Thread.sleep(10000);
	}

	@Then("^close the browser$")
	public void close_the_browser(){
		
	    driver.quit();
	}



}
