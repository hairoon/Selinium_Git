package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Login_Stepdefinition extends Base_Class{
	
	public static WebDriver driver = Runner.driver;
	
	@Given("^User login the Adactin Application$")
	public void user_login_the_Adactin_Application() throws Throwable {
		
		getUrl("https://adactinhotelapp.com/");
	   
	}

	@When("^User enter the valid user name$")
	public void user_enter_the_valid_user_name() throws Throwable {
		
		inputOfElement(driver.findElement(By.id("username")), "vinovicky");
	    
	}

	@When("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		
		inputOfElement(driver.findElement(By.id("password")), "Jan@2020");
	    
	}

	@When("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		
		clickOnElement(driver.findElement(By.id("login")));
	   
	}

	@Then("^User validate the Username and Password$")
	public void user_validate_the_Username_and_Password() throws Throwable {
	    
	}

}
