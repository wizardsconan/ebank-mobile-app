package app.msb.ebank.mobile.steps.serenity;

import app.msb.ebank.mobile.pages.HomePages;
import net.thucydides.core.annotations.Step;

public class HomeSteps {
	HomePages HomePage;
	
	@Step
	public void clickLoadTransaction() {
		HomePage.clickLoadTransactions();
	}
	
}
