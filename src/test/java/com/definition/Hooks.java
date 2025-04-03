package com.definition;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import com.utilities.HelperClass;

public class Hooks {

    @Before
    public void setup() {  // Removed static
        HelperClass.setupDriver();
    }

    @After
    public void teardown(Scenario scenario) {  // Corrected Scenario import and removed static
        HelperClass.teardown();
    }
}
