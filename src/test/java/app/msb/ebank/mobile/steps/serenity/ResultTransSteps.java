package app.msb.ebank.mobile.steps.serenity;

import app.msb.ebank.mobile.pages.ResultTransPages;
import net.thucydides.core.annotations.Step;

public class ResultTransSteps {
	ResultTransPages ResultTrans;
	
	@Step
	public void clickEndTransactions() {
		ResultTrans.clickEndTransactions();
	}
	@Step
	public void checkSuccessfull(String message) {
		ResultTrans.checkSuccessfull(message);
	}
	
	
}
