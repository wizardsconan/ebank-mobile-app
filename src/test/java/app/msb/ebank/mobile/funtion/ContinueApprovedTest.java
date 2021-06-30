package app.msb.ebank.mobile.funtion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import app.msb.ebank.mobile.models.AccountLogin;
import app.msb.ebank.mobile.models.InfoOtp;
import app.msb.ebank.mobile.models.UserOrContact;
import app.msb.ebank.mobile.steps.serenity.AcceptTermsConditionsSteps;
import app.msb.ebank.mobile.steps.serenity.ActiveAccountAppStep;
import app.msb.ebank.mobile.steps.serenity.ContinueApprovedSteps;
import app.msb.ebank.mobile.steps.serenity.HomeSteps;
import app.msb.ebank.mobile.steps.serenity.LoginSteps;
import app.msb.ebank.mobile.steps.serenity.OTPSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class ContinueApprovedTest {
	@Managed(uniqueSession = false)
   WebDriver webdriver;

    @Steps
    ActiveAccountAppStep ActiveAccountApp;
    @Steps
    AcceptTermsConditionsSteps AcceptTermsConditions;
    @Steps
    OTPSteps OTPStep;
    @Steps
    LoginSteps Login;
    @Steps
    HomeSteps HomeSteps;
    @Steps
    ContinueApprovedSteps ContinueAproved;
    InfoOtp otp= new InfoOtp("1","1","1","1","1","1");
    AccountLogin info = new AccountLogin(UserOrContact.UserMaker, UserOrContact.Password);
    @Test
    public void CheckHomepageTest() {
    	ActiveAccountApp.activeAccountAppStep();
    	AcceptTermsConditions.acceptTermsConditions();
    	Login.login_App_With(info);
    	OTPStep.verifyOTP_witht(otp);
    	HomeSteps.clickLoadTransaction();
    	ContinueAproved.clickApprovedBT();
    }

}
