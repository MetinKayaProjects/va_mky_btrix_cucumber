package com.btrix.step_definitions;

import com.btrix.pages.ActivityStreamPage;
import com.btrix.pages.MyTasksPage;
import com.btrix.pages.NewTaskPage;
import com.btrix.utilities.BrowserUtils;
import com.btrix.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MyTasksStepDefs {

    @When("I click on the new task button")
    public void i_click_on_the_new_task_button() {
        MyTasksPage myTasksPage = new MyTasksPage();
        myTasksPage.newTaskArrow.click();
        myTasksPage.newTaskUnderArrow.click();
    }

    @When("I write in the thingsToDo title box")
    public void i_write_in_the_thingsToDo_title_box() {
        MyTasksPage myTasksPage = new MyTasksPage();
        //WebElement frame = Driver.get().findElement(By.cssSelector("iframe[id*='iframe_']"));
        Driver.get().switchTo().frame(myTasksPage.frame);
        myTasksPage.thingsToDoBox.sendKeys("TestFB");
    }

    @When("I write in the bodyBox below the thingsToDo title box")
    public void i_write_in_the_bodyBox_below_the_thingsToDo_title_box() {
        MyTasksPage myTasksPage = new MyTasksPage();
        Driver.get().switchTo().frame(myTasksPage.frame2);
        myTasksPage.getThingsToDoBox2.sendKeys("Test_CybertekSchool");
    }

    @When("I click addTaskButton")
    public void i_click_addTaskButton() {
        MyTasksPage myTasksPage = new MyTasksPage();
        Driver.get().switchTo().parentFrame();
        myTasksPage.addTaskEnterButton.click();
    }





    @Then("Our task should appear on the tasks page")
    public void our_task_should_appear_on_the_tasks_page() {
        Driver.get().switchTo().defaultContent();

        String expectedNewTask = "TestFB";
        System.out.println("expectedNewTask = " + expectedNewTask);
        BrowserUtils.waitFor(10);

        MyTasksPage myTasksPage = new MyTasksPage();

        List<String> allNewTAsks = myTasksPage.newTaskVerify();


        String actualNewTask = null;
       for (int i=0; i<myTasksPage.titleNames.size(); i++){
          if(allNewTAsks.get(i).contains(expectedNewTask)){
              actualNewTask = allNewTAsks.get(i);
          }
       }

       System.out.println("actualNewTask = " + actualNewTask);



        Assert.assertTrue(actualNewTask.contains(expectedNewTask));
    }



}
