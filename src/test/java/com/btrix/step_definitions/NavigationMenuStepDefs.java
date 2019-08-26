package com.btrix.step_definitions;

import com.btrix.pages.ActivityStreamPage;
import com.btrix.utilities.BrowserUtils;
import com.btrix.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NavigationMenuStepDefs {

    @When("I navigate to {string}")
    public void i_navigate_to(String tab) {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        activityStreamPage.getTab(tab).click();

    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String pageTitle) {
        String expectedPageTitle = pageTitle;
        BrowserUtils.waitForPageToLoad(15);
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String actualPageTitle = Driver.get().getTitle();

        System.out.println("expectedPageTitle = " + expectedPageTitle);
        System.out.println("actualPageTitle = " + actualPageTitle);

        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }

    }
