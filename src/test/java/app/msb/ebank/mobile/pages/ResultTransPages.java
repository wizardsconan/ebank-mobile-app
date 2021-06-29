package app.msb.ebank.mobile.pages;

import app.msb.ebank.mobile.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ResultTransPages extends MobilePageObject {
	@AndroidFindBy(xpath="//android.widget.TextView[text()='Kết thúc']")
	WebElementFacade ENDTRANS;
	@AndroidFindBy(xpath="//android.widget.TextView[text()='Duyệt: Thành công']")
	WebElementFacade MSSUCCESS;
	
	
	
	public void clickEndTransactions() {
		$(ENDTRANS).click();
	}
	public String checkSuccessfull(String message ) {
		return $(MSSUCCESS).getText();
	}
	
	
}
