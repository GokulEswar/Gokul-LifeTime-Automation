package org.cucumberwebsite;

import java.io.Console;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lifetime {
	static WebDriver driver;
@Given("Opening a brower and navigate into Lifetime site")
public void opening_a_brower_and_navigate_into_Lifetime_site() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\user\\eclipse-workspace\\java workspace\\CucumberStart\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lifetime.life/");
}

@When("Fetching all drown down title")
public void fetchAllTitle() {
	List<WebElement> findElements = driver.findElements(By.xpath("//a[@class=' nav-link    dropdown-toggle']"));
	for (int i = 1; i <= findElements.size(); i++) {
		System.out.println(driver.findElement(By.xpath("(//a[@class=' nav-link    dropdown-toggle'])["+i+"]")).getText());
	}
	
}

@When("Fetching sports drop down list items")
public void fetchSports() {
	List<WebElement> findSportsElements = driver.findElements(By.xpath("(//ul[@class='list-unstyled dropdown-columns']/li/a[@class='dropdown-item '])"));
		for (int i = 1; i <= findSportsElements.size(); i++) {
		String test=driver.findElement(By.xpath("(//ul[@class='list-unstyled dropdown-columns']/li/a[@class='dropdown-item '])["+i+"]")).getText();
		System.out.println(test);
	}
	
}

@When("Fetching Training drop down list items")
public void fetchTrainingList() {
	List<WebElement> findTrainingElements = driver.findElements(By.xpath("//li[@class='nav-item  dropdown open']/div[2]/ul/li/a[@class='dropdown-item ']"));
		for (int i = 1; i <= findTrainingElements.size(); i++) {
		System.out.println(driver.findElement(By.xpath("(//li[@class='nav-item  dropdown open']/div[2]/ul/li/a[@class='dropdown-item '])["+i+"]")).getText());
	}
	
}
@Then("Store the data into variable")
public void store_the_data_into_variable() {
	System.out.println("Condition will follow");
	driver.quit();
}
}