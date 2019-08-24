package com.btrix.pages;

import com.btrix.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.get(),this);
    }

//BURAYA METHOD YAZ... SOLDAKI MENULARE METOD GOTURSUN

    @FindBy(xpath = "//span[@class='menu-item-link-text'][contains(text(), 'Tasks')]")
    public WebElement tasksButton;

//***********************Sign Button is not located! ******************************************
    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_tasks\"]/span[1]")
    public WebElement plusSign;
//********************************************************************************************








}
