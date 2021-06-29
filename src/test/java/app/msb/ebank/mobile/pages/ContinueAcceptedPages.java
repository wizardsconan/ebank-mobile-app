package app.msb.ebank.mobile.pages;

import app.msb.ebank.mobile.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ContinueAcceptedPages extends MobilePageObject {

	@AndroidFindBy(xpath="//android.widget.TextView[text()='TIẾP TỤC']")
	WebElementFacade CONTINUEBT;
	
	@AndroidFindBy(xpath="//android.widget.TextView[text()='HUỶ']")
	WebElementFacade CANCELBT;
	
	public void clickApprovedBT() {
		$(CONTINUEBT).click();
	}
	public void clickRejectBT() {
		$(CANCELBT).click();
	}
	
}
