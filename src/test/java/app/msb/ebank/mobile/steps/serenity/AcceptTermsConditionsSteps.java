package app.msb.ebank.mobile.steps.serenity;

import app.msb.ebank.mobile.pages.AcceptTermsConditionsPages;
import net.thucydides.core.annotations.Step;

public class AcceptTermsConditionsSteps {
	AcceptTermsConditionsPages AcceptTerms;
	
	@Step
	public void acceptTermsConditions() {
		checkAcceptTermsConditions();
		click_acceptButton();
	}
	@Step
	public void checkAcceptTermsConditions() {
		AcceptTerms.acceptTermsConditions();
	}
	@Step
	public void click_acceptButton() {
		AcceptTerms.acceptButton();
	}
	@Step
	public void click_rejectButton() {
		AcceptTerms.rejectButton();
	}
}
