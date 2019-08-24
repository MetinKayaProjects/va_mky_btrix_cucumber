package com.btrix.pages;

import com.btrix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    @FindBy(xpath = "//table[@id='TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_table']/tbody/tr/td[3]")
    public List<WebElement> titleNames;

    public String newTaskVerify(String expectedTaskTitle) {
        int numberOfTasks = titleNames.size();
        System.out.println("numberOfTasks = " + numberOfTasks);
        String tasksListTitle = null;

        for (int i=0; i<numberOfTasks; i++) {
            if (titleNames.get(i).getText().contains(expectedTaskTitle)){
                tasksListTitle = titleNames.get(i).getText();
            }
        }
        return tasksListTitle;
    }


}
