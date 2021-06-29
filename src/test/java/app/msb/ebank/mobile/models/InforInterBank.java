package app.msb.ebank.mobile.models;

public class InforInterBank {
	/*
	 * public static InformationBuilder AccountNo(String bnfAcctNo) { return new
	 * InformationBuilder(bnfAcctNo); }
	 */
	public static InformationBuilder Amount(String amount) {
		return new InformationBuilder(amount);
	}

	public static class InformationBuilder {
		// private String bnfAcctNo;
		// private String bnfName;
		// private String bnfBankName;
		// private String bnfBranchName;
		// private String notifyMaker;
		private String amount;
		private String remark;

		/*
		 * public InformationBuilder(String bnfAcctNo) { this.bnfAcctNo=bnfAcctNo; }
		 * public InformationBuilder withBnfName(String bnfName) { this.bnfName=bnfName;
		 * // TODO Auto-generated method stub return this; } public InformationBuilder
		 * withBnfBankName(String bnfBankName) { this.bnfBankName=bnfBankName; // TODO
		 * Auto-generated method stub return this; } public InformationBuilder
		 * withBnfBranchName(String bnfBranchName) { this.bnfBranchName=bnfBranchName;
		 * // TODO Auto-generated method stub return this; }
		 * 
		 * public InformationBuilder withAmount(String amount) { this.amount=amount; //
		 * TODO Auto-generated method stub return this; } public InformationBuilder
		 * withRemark(String remark) { this.remark=remark; // TODO Auto-generated method
		 * stub return this; }
		 * 
		 * 
		 * public InforInterBank build() { // TODO Auto-generated method stub // return
		 * new InforInterBank(bnfAcctNo, amount, remark, bnfName, bnfBankName,
		 * bnfBranchName); }
		 */
		public InformationBuilder(String amount) {
			this.amount = amount;
			// TODO Auto-generated method stub

		}

		public InformationBuilder withRemark(String remark) {
			this.remark = remark;
			// TODO Auto-generated method stub
			return this;
		}

		public InforInterBank build() {
			// TODO Auto-generated method stub
			// return new InforInterBank(bnfAcctNo, amount, remark, bnfName, bnfBankName,
			// bnfBranchName);
			return new InforInterBank(amount, remark);
		}
	}

	// private String rolloutAcctNo;
	// private String bnfAcctNo;

	private String amount;
	private String remark;

	/*
	 * private String bnfName; private String bnfBankName; private String
	 * bnfBranchName;
	 * 
	 * 
	 * public String getbnfAcctNo() { return bnfAcctNo; } public void
	 * setbnfAcctNo(String bnfAcctNo) { this.bnfAcctNo = bnfAcctNo; } public String
	 * getbnfName() { return bnfName ; } public void setbnfName(String bnfName) {
	 * this.bnfName=bnfName; } public String getbnfBankName() { return bnfBankName ;
	 * } public void setbnfBankName(String bnfBankName) {
	 * this.bnfBankName=bnfBankName; } public String getbnfBranchName() { return
	 * bnfBranchName ; } public void setbnfBranchName(String bnfBranchName) {
	 * this.bnfBranchName=bnfBranchName; }
	 */
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
	 * 
	 * public InforInterBank(String bnfAcctNo, String bnfName, String bnfBankName,
	 * String bnfBranchName, String amount, String remark) {
	 * //this.rolloutAcctNo=rolloutAcctNo; this.bnfAcctNo = bnfAcctNo;
	 * this.amount=amount; this.remark=remark; this.bnfName=bnfName;
	 * this.bnfBankName=bnfBankName; this.bnfBranchName=bnfBranchName; }
	 */

	public InforInterBank(String amount, String remark) {

		this.amount = amount;
		this.remark = remark;

	}

}
