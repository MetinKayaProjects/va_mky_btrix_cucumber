package com.btrix.pages;

import com.btrix.utilities.BrowserUtils;
import com.btrix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MyTasksPage {

    public MyTasksPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "tasks-popupMenuAdd")
    public WebElement newTaskArrow;

    @FindBy(xpath = "(//span[@class=\"menu-popup-item-text\"][contains(text(), 'New task')])[1]")
    public WebElement newTaskUnderArrow;

    //    @FindBy(css = "div[class=task-info-panel]")
//    public WebElement thingsToDoBox;
    @FindBy(css = "input[name='ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement thingsToDoBox;

    @FindBy(css = "iframe[id*='iframe_']")
    public WebElement frame;


    @FindBy(css = "body[contenteditable=true]")
    public WebElement getThingsToDoBox2;

    @FindBy(css = "iframe[class='bx-editor-iframe']")
    public WebElement frame2;

    @FindBy(css = "button[class='ui-btn ui-btn-success']")
    public WebElement addTaskEnterButton;


    @FindBy(xpath = "(//table[@class='main-grid-table'])[1]//tr//td[3]")
    public List<WebElement> titleNames;


//    @FindBy(xpath = "//a[@class='task-title task-status-text-color-accepted']")
//    public List<WebElement> taskTitleLinks;

//xpath = "//table[@id='TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_table']/tbody/tr/td[3]"

    public List<String> newTaskVerify() {
//       int c= Driver.get().findElements(By.xpath("//a[@class='task-title task-status-text-color-accepted']")).size();
//        System.out.println("COUNTTTTTT: "  + c);
//        Driver.get().findElements(By.xpath("//a[@class='task-title task-status-text-color-accepted']")).forEach(el -> System.out.println(el.getText()));

        int numberOfTasks = titleNames.size();
        System.out.println("numberOfTasks = " + numberOfTasks);
      //  System.out.println("taskTitleLinks = " + taskTitleLinks.size());

        List<String> tasksListTitle = new ArrayList<>();

        for (int i=0; i<titleNames.size(); i++) {

            tasksListTitle.add(titleNames.get(i).getText());

        }
        return tasksListTitle;
    }


}
