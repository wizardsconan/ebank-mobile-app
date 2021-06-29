package app.msb.ebank.mobile.pages;

import app.msb.ebank.mobile.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPages extends MobilePageObject {
	@AndroidFindBy(xpath="//android.widget.EditText[text()='Tên truy cập']")
	WebElementFacade USERNAME;
	@AndroidFindBy(xpath="//android.widget.EditText[text()='Mật khẩu']")
	WebElementFacade PASSWORD;
	@AndroidFindBy(xpath="//android.widget.TextView[text(KÍCH HOẠT)]")
	WebElementFacade LOGINBT;
	
	public void input_Username(String username) {
		$(USERNAME).type(username);
	}
	public void input_Password(String password) {
		$(PASSWORD).type(password);
	}
	
	public void click_LoginBT() {
		$(LOGINBT).click();		
	}
}
