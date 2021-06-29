package app.msb.ebank.mobile.pages;

import app.msb.ebank.mobile.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePages extends MobilePageObject {
	@AndroidFindBy(xpath="//android.widget.TextView[text()='041-01-01-002279-1']")
	WebElementFacade LOADTRANS;
	@AndroidFindBy(xpath="//android.view.ViewGroup[3]")
	WebElementFacade CHOSSEITEM;
	
	@AndroidFindBy(xpath="//android.widget.TextView[text()='DUYỆT']")
	WebElementFacade ACCEPTBT;
	
	@AndroidFindBy(xpath="//android.widget.TextView[text()='TỪ CHỐI']")
	WebElementFacade REJECTBT;
	
	public void clickLoadTransactions() {
		$(LOADTRANS).click();
	}
	public void clickChosenItem() {
		$(CHOSSEITEM).click();
	}
	public void clickApprovedBT() {
		element(ACCEPTBT).click();
	}
	public void clickRejectBT() {
		element(REJECTBT).click();
	}
	
}
