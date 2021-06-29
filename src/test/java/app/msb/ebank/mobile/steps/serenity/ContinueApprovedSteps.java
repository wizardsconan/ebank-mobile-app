package app.msb.ebank.mobile.steps.serenity;

import app.msb.ebank.mobile.pages.ContinueAcceptedPages;
import net.thucydides.core.annotations.Step;

public class ContinueApprovedSteps {
	ContinueAcceptedPages ContinueAccepted;
	
	@Step
	public void clickApprovedBT() {
		ContinueAccepted.clickApprovedBT();
	}
	@Step
	public void clickRejectBT() {
		ContinueAccepted.clickRejectBT();
	}
	
	
}
