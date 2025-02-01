package com.fss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumbercode {
    WebDriver driver = null;
    @Given ("^I open the browser$")
    public void openBrowser() {
        driver = new ChromeDriver();  
    }
    @When ("^I open the application$")
    public void openApplication() {
        driver.get("https://www.google.com");
    }
    @Then ("^I validate the outcomes$")
    public void validateOutcomes() {
        System.out.println("Title of the page is: " + driver.getTitle());
        driver.quit();
    }
    
    

}
