package app.msb.ebank.mobile.pages;
import app.msb.ebank.mobile.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
public class ActiveAppPages extends MobilePageObject{
	@AndroidFindBy(xpath="//android.widget.TextView[text()='KÍCH HOẠT ỨNG DỤNG']")
	WebElementFacade ACTIVEBT;
	public void activeApp() {
		$(ACTIVEBT).click();
	}

}
