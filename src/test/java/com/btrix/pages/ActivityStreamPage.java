package com.btrix.pages;

import com.btrix.utilities.BrowserUtils;
import com.btrix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(xpath = "//span[@class='menu-item-link-text'][contains(text(), 'Tasks')]")
    public WebElement tasksButton;

    public WebElement getTab(String tab) {
        BrowserUtils.verifyElementDisplayed(moreHidden);
        moreHidden.click();
        String tabXpath = "//span[@class='menu-item-link-text'][contains(text(), '" + tab + "')]";
       WebElement tabMenu =Driver.get().findElement(By.xpath(tabXpath));
        return tabMenu;
    }

    @FindBy(css = "[id=user-name]")
    public WebElement toLogout;

    @FindBy(xpath = "//a[@class='menu-popup-item menu-popup-no-icon ']/span[contains(text(), 'Log out')]")
    public WebElement logout;

    @FindBy(xpath = "//span[@class=\"menu-favorites-more-text\"][contains(text(), 'More')]")
    public WebElement moreHidden;




}
