package com.btrix.step_definitions;

import com.btrix.pages.ActivityStreamPage;
import com.btrix.pages.MyTasksPage;
import com.btrix.utilities.Driver;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActivityStreamStepDefs {

    @When("I click on the tasks button")
    public void i_click_on_the_tasks_button() {

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();

//        Actions actions = new Actions(Driver.get());
//        actions.moveToElement(activityStreamPage.tasksButton).moveToElement(activityStreamPage.plusSign).perform();
//        activityStreamPage.plusSign.click();
        activityStreamPage.tasksButton.click();

    }

//

}
