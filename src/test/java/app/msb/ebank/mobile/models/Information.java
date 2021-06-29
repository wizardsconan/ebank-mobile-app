package app.msb.ebank.mobile.models;

public class Information {
	public static Informational AccountNo(String bnfAcctNo) {
		return new Informational(bnfAcctNo);
	}

	public static class Informational {
		// private String rolloutAcctNo;
		private String bnfAcctNo;
		private String amount;
		private String remark;

		public Informational(String bnfAcctNo) {
			this.bnfAcctNo = bnfAcctNo;
		}

		/*
		 * public InformationBuilder withBnfAcctNo(String bnfAcctNo) {
		 * this.bnfAcctNo=bnfAcctNo; // TODO Auto-generated method stub return this; }
		 */

		public Informational withAmount(String amount) {
			this.amount = amount;
			// TODO Auto-generated method stub
			return this;
		}

		public Informational withRemark(String remark) {
			this.remark = remark;
			// TODO Auto-generated method stub
			return this;
		}

		public Information build() {
			// TODO Auto-generated method stub
			return new Information(bnfAcctNo, amount, remark);
		}
	}

	// private String rolloutAcctNo;
	private String bnfAcctNo;
	private String amount;
	private String remark;

	public String getbnfAcctNo() {
		return bnfAcctNo;
	}

	public void setbnfAcctNo(String bnfAcctNo) {
		this.bnfAcctNo = bnfAcctNo;
	}

	public String getamount() {
		return amount;
	}

	public void setamount(String amount) {
		this.amount = amount;
	}

	public String getremark() {
		return remark;
	}

	public void setremark(String remark) {
		this.remark = remark;
	}

	/*
	 * public String getfeeSuorce() { return feeSuorce ; } public void
	 * setfeeSuorce(String feeSuorce) { this.feeSuorce=feeSuorce; } public String
	 * getwaitingApprove() { return waitingApprove ; } public void
	 * setwaitingApprove(String waitingApprove) {
	 * this.waitingApprove=waitingApprove; } public String getapppriorty() { return
	 * apppriorty ; } public void setapppriorty(String apppriorty) {
	 * this.apppriorty=apppriorty; } public String getnotifyMaker() { return
	 * notifyMaker ; } public void setnotifyMaker(String notifyMaker) {
	 * this.notifyMaker=notifyMaker; }
	 */
	public Information(String bnfAcctNo, String amount, String remark) {
		// this.rolloutAcctNo=rolloutAcctNo;
		this.bnfAcctNo = bnfAcctNo;
		this.amount = amount;
		this.remark = remark;
		/*
		 * this.feeSuorce=feeSuorce; this.waitingApprove=waitingApprove;
		 * this.apppriorty=apppriorty; this.notifyMaker=notifyMaker;
		 */
	}

}
