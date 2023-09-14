package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 {
	WebDriver driver=new ChromeDriver();
	@Given("Open the Orange HRM and the user should be on login page")
	public void open_the_orange_hrm_and_the_user_should_be_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}
	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	    
	}
//	@When("User enters the username and password")
//	public void user_enters_the_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//	    
//	}

	@When("Clicks on to Login")
	public void clicks_on_to_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	    
	}

	@Then("Check if the user is logged in successfully")
	public void check_if_the_user_is_logged_in_successfully() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		Thread.sleep(5000);
		driver.quit();
	}

}
