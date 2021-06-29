package app.msb.ebank.mobile.models;

public class InfoContact {
	public static Contact WithTitle(String title) {
		// TODO Auto-generated method stub
		return new Contact(title);
	}

	public static class Contact {
		private String title;
		private String content;


		public Contact (String title) {
			this.title = title;

		}

		public Contact withContent(String content) {
			this.content = content;
			// TODO Auto-generated method stub
			return this;
		}


		public InfoContact build() {
			// TODO Auto-generated method stub
			return new InfoContact(title, content);
		}
	};

	private String title;
	private String content;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;

	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public InfoContact(String title, String content) {
		this.title = title;
		this.content = content;
	
	}

}
