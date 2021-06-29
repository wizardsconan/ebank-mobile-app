package app.msb.ebank.mobile.models;

public class Data {
	public static EnterData With(String data) {
		// TODO Auto-generated method stub
		return new EnterData(data);
	}

	public static class EnterData {
		private String data;

		public EnterData(String data) {
			this.data = data;

		}

		public Data build() {
			// TODO Auto-generated method stub
			return new Data(data);
		}
	}

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;

	}

	public Data(String data) {
		this.data = data;

	}

}
