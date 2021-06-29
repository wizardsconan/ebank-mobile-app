package app.msb.ebank.mobile.models;

public class InfoLimit {
	public static Limit InternalDaily(String internalDaily) {
		// TODO Auto-generated method stub
		return new Limit(internalDaily);
	}
	public static class Limit{
		private String internalDaily;
		private String interBankDaily;
		private String quickInterBankDaily;
		private String internalMaxLimit;
		private String interBankMaxLimit;
		private String quickInterBankMaxLimit;

		public Limit(String internalDaily) {
			this.internalDaily= internalDaily;
		}
		public Limit withInterBankDaily(String interBankDaily) {
			this.interBankDaily=interBankDaily;

			return this;
		}

		public Limit withQuickInterBankDaily(String quickInterBankDaily) {
			this.quickInterBankDaily=quickInterBankDaily;
			
			return this;
		}

		public Limit withInterBankMaxLimit(String interBankMaxLimit) {
			this.internalMaxLimit=interBankMaxLimit;
		
			return this;
		}
		public Limit withInternalMaxLimit(String internalMaxLimit) {
			this.interBankMaxLimit=internalMaxLimit;
			
			return this;
		}
		public Limit withQuickInterBankMaxLimit(String quickInterBankMaxLimit) {
			this.quickInterBankMaxLimit=quickInterBankMaxLimit;
			
			return this;
		}

		public InfoLimit build() {
			
			return new InfoLimit(internalDaily, interBankDaily, quickInterBankDaily, internalMaxLimit, interBankMaxLimit, quickInterBankMaxLimit);
		}
	}
	private String internalDaily;
	private String interBankDaily;
	private String quickInterBankDaily;
	private String internalMaxLimit;
	private String interBankMaxLimit;
	private String quickInterBankMaxLimit;
	public String getInternalDaily() {
		return internalDaily;
	}
	public void setInternalDaily(String internalDaily) {
		this.internalDaily = internalDaily;
	}
	public String getInterBankDaily() {
		return interBankDaily;
	}
	public void setInterBankDaily(String interBankDaily) {
		this.interBankDaily = interBankDaily;
	}
	public String getQuickInterBankDaily() {
		return quickInterBankDaily ;
	}
	public void setQuickInterBankDaily(String quickInterBankDaily) {
		this.quickInterBankDaily=quickInterBankDaily;
	}
	public String getInternalMaxLimit() {
		return internalMaxLimit;
	}
	public void setInternalMaxLimit(String internalMaxLimit) {
		this.internalMaxLimit = internalMaxLimit;
	}
	public String getInterBankMaxLimit() {
		return interBankMaxLimit;
	}
	public void setInterBankMaxLimit(String interBankMaxLimit) {
		this.interBankMaxLimit = interBankMaxLimit;
	}
	

	public String getQuickInterBankMaxLimit() {
		return quickInterBankMaxLimit ;
	}
	public void setQuickInterBankMaxLimit(String quickInterBankMaxLimit) {
		this.quickInterBankMaxLimit=quickInterBankMaxLimit;
	}

	public InfoLimit(String internalDaily, String interBankDaily,String quickInterBankDaily, String internalMaxLimit, String interBankMaxLimit, String quickInterBankMaxLimit) {
		this.internalDaily=internalDaily;
		this.interBankDaily=interBankDaily;
		this.quickInterBankDaily = quickInterBankDaily;
		this.internalMaxLimit=internalMaxLimit;
		this.interBankMaxLimit=interBankMaxLimit;
		this.quickInterBankMaxLimit=quickInterBankMaxLimit;
	}

}
