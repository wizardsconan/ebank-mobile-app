package app.msb.ebank.mobile.models;

public class InfomationTTRTransfer {
	public static InfomationTTR OriginalAmount(String originalAmount) {
		return new InfomationTTR(originalAmount);
	}

	public static class InfomationTTR {
		// private String rolloutAcctNo;
		private String originalAmount;
		private String amount;
		private String remark;
		private String address;
		private String reAddress;
		private String contract;

		public InfomationTTR(String originalAmount) {
			this.originalAmount = originalAmount;
		}

		public InfomationTTR withAmount(String amount) {
			this.amount = amount;
			return this;
		}

		public InfomationTTR withRemark(String remark) {
			this.remark = remark;
			return this;
		}
		public InfomationTTR withaddress(String address) {
			this.address = address;
			return this;
		}
		public InfomationTTR withreAddress(String reAddress) {
			this.reAddress = reAddress;
			return this;
		}
		public InfomationTTR withcontractNo(String contract) {
			this.contract = contract;
			return this;
		}


		public InfomationTTRTransfer build() {
			return new InfomationTTRTransfer(originalAmount, amount, remark,contract,address,reAddress);
		}
		
	}

	// private String rolloutAcctNo;
	private String originalAmount;
	private String amount;
	private String remark;
	private String address;
	private String reAddress;
	private String contract;

	public String getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
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
	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}
	public String getreAddress() {
		return reAddress;
	}

	public void setreAddress(String reAddress) {
		this.reAddress = reAddress;
	}
	public String getcontract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	
	public InfomationTTRTransfer(String originalAmount, String amount, String remark, String address, String reAddress, String contract) {
		// this.rolloutAcctNo=rolloutAcctNo;
		this.originalAmount = originalAmount;
		this.amount = amount;
		this.remark = remark;
		this.address=address;
		this.reAddress=reAddress;
		this.contract=contract;
	}

}
