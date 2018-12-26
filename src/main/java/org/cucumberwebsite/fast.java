package org.cucumberwebsite;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fast 
{
	static WebDriver driver;
	static String getSpeed;
	@Given("Opening the browser and navigate into www.fast.com")
	public void opening_the_browser_and_navigate_into_www_fast_com() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\java workspace\\CucumberStart\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fast.com/");
		}

	@When("get the fast of our internet")
	public void get_the_fast_of_our_internet() throws InterruptedException {
//	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(15000);
	    getSpeed=driver.findElement(By.xpath("//*[@id=\"speed-value\"]")).getText();
	    System.out.println("Here Your Internet Speed:"+getSpeed);
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		Assert.assertEquals(driver.findElement(By.id("speed-value")).getText(), getSpeed);
		driver.quit();
		
	}

}
