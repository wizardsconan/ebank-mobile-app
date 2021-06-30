package app.msb.ebank.mobile.models;

public class InfoOtp {
	public static Otp InternalDaily(String otp1) {
		// TODO Auto-generated method stub
		return new Otp(otp1);
	}
	public static class Otp{
		private String otp1;
		private String otp2;
		private String otp3;
		private String otp4;
		private String otp5;
		private String otp6;

		public Otp(String otp1) {
			this.otp1= otp1;
		}
		public Otp withOtp2(String otp2) {
			this.otp2=otp2;

			return this;
		}

		public Otp withOtp3(String otp3) {
			this.otp3=otp3;
			
			return this;
		}

		public Otp withOtp4(String otp4) {
			this.otp4=otp4;
		
			return this;
		}
		public Otp withOtp5(String otp5) {
			this.otp5=otp5;
			
			return this;
		}
		public Otp withQuickOtp6(String otp6) {
			this.otp6=otp6;
			
			return this;
		}

		public InfoOtp build() {
			
			return new InfoOtp(otp1, otp2, otp3, otp4, otp5, otp6);
		}
	}
	private String otp1;
	private String otp2;
	private String otp3;
	private String otp4;
	private String otp5;
	private String otp6;
	public String getOtp1() {
		return otp1;
	}
	public void setOtp1(String otp1) {
		this.otp1 = otp1;
	}
	public String getOtp2() {
		return otp2;
	}
	public void setOtp2(String otp2) {
		this.otp2 = otp2;
	}
	public String getOtp3() {
		return otp3 ;
	}
	public void setOtp3(String otp3) {
		this.otp3=otp3;
	}
	public String getOtp4() {
		return otp4;
	}
	public void setOtp4(String otp4) {
		this.otp4 = otp4;
	}
	public String getOtp5() {
		return otp5;
	}
	public void setOtp5(String otp5) {
		this.otp5 = otp5;
	}
	

	public String getOtp6() {
		return otp6 ;
	}
	public void setOtp6(String otp6) {
		this.otp6=otp6;
	}

	public InfoOtp(String otp1, String otp2,String otp3, String otp4, String otp5, String otp6) {
		this.otp1=otp1;
		this.otp2=otp2;
		this.otp3= otp3;
		this.otp4=otp4;
		this.otp5=otp5;
		this.otp6=otp6;
	}

}
