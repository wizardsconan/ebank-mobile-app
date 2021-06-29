package app.msb.ebank.mobile.models;

public class AccountLogin {
	public static AccountBuilder Withusername(String username) {
		// TODO Auto-generated method stub
		return new AccountBuilder(username);
	}

	public static class AccountBuilder {
		private String username;
		private String password;
		private String capcha;


		public AccountBuilder(String username) {
			this.username = username;

		}

		public AccountBuilder withPassword(String password) {
			this.password = password;
			// TODO Auto-generated method stub
			return this;
		}

		public AccountBuilder withCapcha(String capcha) {
			this.capcha = capcha;
			// TODO Auto-generated method stub
			return this;
		}


		public AccountLogin build() {
			// TODO Auto-generated method stub
			return new AccountLogin(username, password, capcha);
		}
	};

	private String username;
	private String password;
	private String capcha;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCapcha() {
		return capcha;
	}

	public void setCapcha(String capcha) {
		this.capcha = capcha;
	}
	

	public AccountLogin(String username, String password, String capcha ) {
		this.username = username;
		this.password = password;
		this.capcha = capcha;
		
	}

}
