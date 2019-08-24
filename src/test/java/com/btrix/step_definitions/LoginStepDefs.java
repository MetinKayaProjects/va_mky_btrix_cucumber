package com.btrix.step_definitions;

import com.btrix.pages.LoginPage;
import com.btrix.utilities.ConfigurationReader;
import com.btrix.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepDefs {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("Opening the login page");
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("I login as a {string}")
    public void i_login_as_a(String helpdesk) {
        LoginPage loginPage =new LoginPage();
        loginPage.login(helpdesk);
    }

}
