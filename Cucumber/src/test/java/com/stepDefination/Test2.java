package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test2 {
	WebDriver driver=new ChromeDriver();
	@Given("Open the google chrome")
	public void open_the_google_chrome() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}

	@When("search for taylor swift")
	public void search_for_taylor_swift() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("APjFqb")).sendKeys("Taylor Swift");
	    
	}

	@When("hit search")
	public void hit_search() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	    
	}

	@Then("close window")
	public void close_window() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		driver.quit();
	    
	}

}
