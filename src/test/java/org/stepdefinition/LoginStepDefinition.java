package org.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.base.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends Utility {

	@Given("User has to be in facebook lobin page")
	public void user_has_to_be_in_facebook_lobin_page() {
		getDriver();
		loadUrl("https://www.facebook.com/");

	}
	
	@When("User enters invalid {string} and invalid {string}")
	public void user_enters_invalid_and_invalid(String user, String pass) {
		WebElement userName = driver.findElement(By.id("email"));
		type(userName, user);
		WebElement password = driver.findElement(By.id("pass"));
		type(password, pass);
	}


	@When("User click Login button")
	public void user_click_Login_button() {
		WebElement btnLogin = driver.findElement(By.id("u_0_b"));
		btnLogin.click();
	}

	@Then("User has to naviagte to login attempt page")
	public void user_has_to_naviagte_to_login_attempt_page() {
		System.out.println("in Login attempt page");
	}

	@Given("User has to be in facebook login page")
	public void user_has_to_be_in_facebook_login_page() {
		getDriver();
		loadUrl("https://www.facebook.com/");

	}
	
	@When("User enters firstname and surname")
	public void user_enters_firstname_and_surname(io.cucumber.datatable.DataTable dref) {
		List<List<String>> li = dref.asLists();
		WebElement firstName = driver.findElement(By.name("firstname"));
		type(firstName,li.get(0).get(0));
		WebElement lastName = driver.findElement(By.name("lastname"));
		type(lastName, li.get(0).get(1));
		WebElement phone = driver.findElement(By.id("u_0_v"));
		type(phone,li.get(1).get(0));
	}
	@Then("User able to Sign up")
	public void user_able_to_Sign_up() {
		System.out.println("User able to signUp");
	}

	@When("User click forgotten account")
	public void user_click_forgotten_account() {
		WebElement forgotPassword = driver.findElement(By.xpath("//a[text() = 'Forgotten account?']"));
		forgotPassword.click();
	}

	@Then("User navigate to password recover page")
	public void user_navigate_to_password_recover_page() {
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
		type(phoneNumber, "1234567890");
	}

}
