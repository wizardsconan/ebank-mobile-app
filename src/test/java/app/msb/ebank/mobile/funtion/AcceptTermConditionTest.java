package app.msb.ebank.mobile.funtion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import app.msb.ebank.mobile.steps.serenity.AcceptTermsConditionsSteps;
import app.msb.ebank.mobile.steps.serenity.ActiveAccountAppStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class AcceptTermConditionTest {
	@Managed(uniqueSession = false)
   WebDriver webdriver;

    @Steps
    ActiveAccountAppStep ActiveAccountApp;
    @Steps
    AcceptTermsConditionsSteps AcceptTermsConditions;
    
    @Test
    public void AcceptTermsConditions() {
    	ActiveAccountApp.activeAccountAppStep();
    	AcceptTermsConditions.acceptTermsConditions();
    	
    }

}
