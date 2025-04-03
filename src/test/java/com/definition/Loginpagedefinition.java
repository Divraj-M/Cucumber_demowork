package com.definition;

import org.testng.Assert;

import com.actions.HomepageActions;
import com.actions.Loginpageactions;
import com.utilities.HelperClass;

import io.cucumber.java.en.*;

public class Loginpagedefinition {
	Loginpageactions objlogin=new Loginpageactions();
	HomepageActions objHomepage=new HomepageActions();
	
	@Given("user is on HRMLogin page {string}")
	public void user_is_on_hrm_login_page(String url) {
		HelperClass.openPage(url);
	}

	@When("enters username and password")
	public void enters_username_and_password() {
		objlogin.login();
	}

	@Then("user should be able to login successfully and new page open")
	public void user_should_be_able_to_login_successfully_and_new_page_open() {
		Assert.assertTrue(objHomepage.getHomepageText().contains("Dashboard"));
	}

}
