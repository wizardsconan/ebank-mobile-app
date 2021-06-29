package app.msb.ebank.mobile.steps.serenity;

import app.msb.ebank.mobile.pages.ActiveAppPages;
import net.thucydides.core.annotations.Step;

public class ActiveAccountAppStep {
	ActiveAppPages ActiveApp;
	
	@Step
	public void activeAccountAppStep() {
		ActiveApp.activeApp();
	}

}
