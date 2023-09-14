package com.stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class googletitle {
	 WebDriver driver;
	 @Before("@T1 or @T2")
	 public void before()
	 {
		 System.out.println("Before Test");
	 }
	@Given("open browser")
	public void open_browser() {
	    // Write code here that turns the phrase above into concrete actions
	  driver=new ChromeDriver();

	}

	@When("open google page")
	public void open_google_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.google.com/");
	}

	@Then("validates title of the page with expected value")
	public void validates_title_of_the_page_with_expected_value() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(driver.getTitle(), "Google");
	}
	@After("@T1")
	public void after()
	{
		System.out.println("After Test");
	}

}
