package app.msb.ebank.mobile.pages;

import app.msb.ebank.mobile.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class InputOTPPages extends MobilePageObject {
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='3']")
	WebElementFacade ONE;
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='4']")
	WebElementFacade TWO;
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='5']")
	WebElementFacade THREE;
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='6']")
	WebElementFacade FOUR;
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='7']")
	WebElementFacade FIVE;
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='8']")
	WebElementFacade SIX;
	
	@AndroidFindBy(xpath="//android.widget.TextView[text()='1']")
	WebElementFacade ONE1;
	
	
	public void input_Otp1(String otp1) {
		
		$(ONE).type(otp1);
	}
	public void input_Otp2(String otp2) {
		
		$(TWO).type(otp2);
	}
	public void input_Otp3(String otp3) {
		
		$(THREE).type(otp3);
	}
	public void input_Otp4(String otp4) {
		
		$(FOUR).type(otp4);
	}
	public void input_Otp5(String otp5) {
		
		$(FIVE).type(otp5);
	}
	public void input_Otp6(String otp6) {
		
		$(SIX).type(otp6);
	}
	public void input_OtpWhenApproved(String otp) {
		
		$(ONE1).type(otp);
	}


}
