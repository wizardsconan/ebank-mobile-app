package app.msb.ebank.mobile.models;

public class Links {
	public static LinksBuilder WithLinks(String link) {
		// TODO Auto-generated method stub
		return new LinksBuilder(link);
	}

	public static class LinksBuilder {
		private String link;

		public LinksBuilder(String link) {
			this.link = link;

		}

		public Links build() {
			// TODO Auto-generated method stub
			return new Links(link);
		}
	};

	private String link;

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;

	}

	public Links(String link) {
		this.link = link;
	}

}
