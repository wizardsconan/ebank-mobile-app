package app.msb.ebank.mobile.steps.serenity;

import app.msb.ebank.mobile.pages.LoginPages;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	LoginPages Login;
	
	@Step
	public void input_Username(String username) {
		Login.input_Username(username);
	}
	@Step
	public void input_Password(String password) {
		Login.input_Password(password);
	}
	@Step
	public void click_LoginButton() {
		Login.click_LoginBT();
	}
}
