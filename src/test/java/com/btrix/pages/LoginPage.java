package com.btrix.pages;

import com.btrix.utilities.ConfigurationReader;
import com.btrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name="USER_LOGIN")
    WebElement usernameBox;

    @FindBy(name="USER_PASSWORD")
    WebElement passwordBox;

    @FindBy(css = "input[class=login-btn]")
    WebElement logInButton;

    public void login(String userType){
        String username = null;
        String password = null;
        if (userType.equalsIgnoreCase("helpdesk")) {
            username = ConfigurationReader.get("helpdesk_username");
            password = ConfigurationReader.get("helpdesk_password");
        }else if (userType.equalsIgnoreCase("hr")) {
            username = ConfigurationReader.get("hr_username");
            password = ConfigurationReader.get("hr_password");
        }else if(userType.equalsIgnoreCase("marketing")) {
            username = ConfigurationReader.get("marketing_username");
            password = ConfigurationReader.get("marketing_password");
        }else{
            System.out.println("invalid username or password!");
        }

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        logInButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        wait.until(ExpectedConditions.titleIs("Portal"));

    }

}
