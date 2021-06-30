package app.msb.ebank.mobile.steps.serenity;

import app.msb.ebank.mobile.models.InfoOtp;
import app.msb.ebank.mobile.pages.InputOTPPages;
import net.thucydides.core.annotations.Step;

public class OTPSteps {
	InputOTPPages InputOTP;
	
	@Step
	public void verifyOTP_witht(InfoOtp inputOtp){
		inputOTP1(inputOtp.getOtp1());
		inputOTP2(inputOtp.getOtp2());
		inputOTP3(inputOtp.getOtp3());
		inputOTP4(inputOtp.getOtp4());
		inputOTP5(inputOtp.getOtp5());
		inputOTP6(inputOtp.getOtp6());
	}
	
	@Step
	public void inputOTP1(String otp1) {
		InputOTP.input_Otp1(otp1);
	}
	@Step
	public void inputOTP2(String otp2) {
		InputOTP.input_Otp2(otp2);
	}
	@Step
	public void inputOTP3(String otp3) {
		InputOTP.input_Otp3(otp3);
	}
	@Step
	public void inputOTP4(String otp4) {
		InputOTP.input_Otp4(otp4);
	}
	@Step
	public void inputOTP5(String otp5) {
		InputOTP.input_Otp5(otp5);
	}
	@Step
	public void inputOTP6(String otp6) {
		InputOTP.input_Otp6(otp6);
	}
	@Step
	public void inputOtpWhenApproved(String otp) {
		InputOTP.input_OtpWhenApproved(otp);
	}
}
