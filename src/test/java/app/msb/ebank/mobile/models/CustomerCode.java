package app.msb.ebank.mobile.models;

public class CustomerCode {
	public static Customer Withcode(String code) {
		// TODO Auto-generated method stub
		return new Customer(code);
	}

	public static class Customer {
		private String code;

		public Customer(String code) {
			this.code = code;

		}

		public CustomerCode Code() {
			// TODO Auto-generated method stub
			return new CustomerCode(code);
		}
	};

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;

	}

	public CustomerCode(String code) {
		this.code = code;

	}

}
