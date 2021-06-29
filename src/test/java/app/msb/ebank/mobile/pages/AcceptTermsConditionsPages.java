package app.msb.ebank.mobile.pages;

import app.msb.ebank.mobile.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AcceptTermsConditionsPages extends MobilePageObject{
	
	@AndroidFindBy(xpath="//android.widget.ImageView")
	WebElementFacade TERMS;
	public void acceptTermsConditions() {
		$(TERMS).click();
	}
	@AndroidFindBy(xpath="//android.widget.TextView[text()='ĐỒNG Ý']")
	WebElementFacade ACCEPTBUTTON;
	public void acceptButton() {
		$(ACCEPTBUTTON).click();
	}
	@AndroidFindBy(xpath="//android.widget.TextView[text()='TỪ CHỐI']")
	WebElementFacade REJECTBUTTON;
	public void rejectButton() {
		$(REJECTBUTTON).click();
	}

}
