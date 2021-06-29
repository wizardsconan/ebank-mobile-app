package app.msb.ebank.mobile.models;

import org.apache.commons.lang3.RandomStringUtils;
public class Account {
	public static AccountBuilder userName(String username) {
		// TODO Auto-generated method stub
		return new AccountBuilder(username);
	}
	public static class AccountBuilder{
		private String username;
		private String name;
		private String email;
		private String phone;
		private String address;
		private String certCode;

		public AccountBuilder(String username) {
			this.username=String.format("%s_%s",RandomStringUtils.randomAlphabetic(10), username);;
		}
		public AccountBuilder withName(String name) {
			this.name=name;

			return this;
		}

		public AccountBuilder withEmail(String email) {
			this.email=email;
			// TODO Auto-generated method stub
			return this;
		}
		public AccountBuilder withRandomEmail(String email) {
			this.email=String.format("%s_%s",RandomStringUtils.randomAlphabetic(10), email);
			// TODO Auto-generated method stub
			return this;
		}
		public AccountBuilder withPhone(String phone) {
			this.phone=phone;
			// TODO Auto-generated method stub
			return this;
		}
		public AccountBuilder withAdress(String address) {
			this.address=address;
			// TODO Auto-generated method stub
			return this;
		}
		public AccountBuilder withRandomCertCode(String certCode) {
			this.certCode=String.format(certCode,RandomStringUtils.randomNumeric(5));
			// TODO Auto-generated method stub
			return this;
		}

		public Account build() {
			// TODO Auto-generated method stub
			return new Account(username, name, email, phone, address, certCode);
		}
	}
	private String username;
	private String name;
	private String email;
	private String phone;
	private String address;
	private String certCode;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	public String getCertCode() {
		return certCode ;
	}
	public void setCertCode(String certCode) {
		this.certCode=certCode;
	}
	public String getEmail() {
		return email ;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public Account(String username, String name,String email, String phone, String address, String certCode) {
		this.username=username;
		this.name=name;
		this.email = email;
		this.phone=phone;
		this.address=address;
		this.certCode=certCode;
	}

}
