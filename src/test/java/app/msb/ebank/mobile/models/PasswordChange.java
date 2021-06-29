package app.msb.ebank.mobile.models;

public class PasswordChange {
	public static ChangePassword With(String oldPassword) {
		// TODO Auto-generated method stub
		return new ChangePassword(oldPassword);
	}

	public static class ChangePassword {
		private String oldPassword;
		private String newPassword;
		private String cofirmPass;

		public ChangePassword(String oldPassword) {
			this.oldPassword = oldPassword;

		}

		public ChangePassword withNewPassword(String newPassword) {
			this.newPassword = newPassword;
			// TODO Auto-generated method stub
			return this;
		}

		public ChangePassword withCofirmPassword(String cofirmPass) {
			this.cofirmPass = cofirmPass;
			// TODO Auto-generated method stub
			return this;
		}

		public PasswordChange build() {
			// TODO Auto-generated method stub
			return new PasswordChange(oldPassword, newPassword, cofirmPass);
		}
	};

	private String oldPassword;
	private String newPassword;
	private String cofirmPass;

	public String getoldPassword() {
		return oldPassword;
	}

	public void setoldPassword(String oldPassword) {
		this.oldPassword = oldPassword;

	}

	public String getnewPassword() {
		return newPassword;
	}

	public void setnewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getcofirmPass() {
		return cofirmPass;
	}

	public void setcofirmPass(String cofirmPass) {
		this.cofirmPass = cofirmPass;
	}

	public PasswordChange(String oldPassword, String newPassword, String cofirmPass) {
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.cofirmPass = cofirmPass;
	}

}
