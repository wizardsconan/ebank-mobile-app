package app.msb.ebank.mobile.funtion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import app.msb.ebank.mobile.steps.serenity.ActiveAccountAppStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

//@WithTags({ @WithTag("parallel"), @WithTag("appium") })
@RunWith(SerenityRunner.class)
public class ActiveAccountAppTest {
	@Managed(uniqueSession = false)
   WebDriver webdriver;

    @Steps
    ActiveAccountAppStep ActiveAccountApp;
    @Test
    @WithTag("Active_App")
    public void clickActiveAccountApp() {
    	ActiveAccountApp.activeAccountAppStep();
    	
    }

}
