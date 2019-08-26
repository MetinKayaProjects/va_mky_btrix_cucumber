package com.btrix.step_definitions;

import com.btrix.utilities.ConfigurationReader;
import com.btrix.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setUp(){
        System.out.println("Before hooks");
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Before("@database")
    public void setUpDBCOnn(){
        System.out.println("Setting up DB connection");
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("After hooks");
        // check if the scenario is failed
        if (scenario.isFailed()){
            // take that screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            // attach the scenario to the report
            scenario.embed(screenshot, "image/png");
        }
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.closeDriver();
    }

    @After("@database")
    public void tearDownConnection(){

        System.out.println("Closing DB connection");
    }
}
