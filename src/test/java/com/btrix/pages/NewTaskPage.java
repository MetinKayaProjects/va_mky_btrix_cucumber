package com.btrix.pages;

import com.btrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTaskPage {
    public NewTaskPage(){
        PageFactory.initElements(Driver.get(),this);
    }

//    @FindBy(css = "div[class=task-info-panel]")
//    public WebElement thingsToDoBox;
//
//    @FindBy(css = "body[contenteditable=true]")
//    public WebElement getThingsToDoBox2;
//
//    @FindBy(css = "button[class='ui-btn ui-btn-success']")
//    public WebElement addTaskEnterButton;
}
