package app.msb.ebank.mobile.funtion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import app.msb.ebank.mobile.steps.serenity.AcceptTermsConditionsSteps;
import app.msb.ebank.mobile.steps.serenity.ActiveAccountAppStep;
import app.msb.ebank.mobile.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class LoginTest {
	@Managed(uniqueSession = false)
   WebDriver webdriver;

    @Steps
    ActiveAccountAppStep ActiveAccountApp;
    @Steps
    AcceptTermsConditionsSteps AcceptTermsConditions;
    @Steps
    LoginSteps Login;
    @Test
    public void AcceptTermsConditions() {
    	ActiveAccountApp.activeAccountAppStep();
    	AcceptTermsConditions.acceptTermsConditions();
    	
    }

}
