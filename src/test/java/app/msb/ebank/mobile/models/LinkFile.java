package app.msb.ebank.mobile.models;

public class LinkFile {

	public class Linksfile {
		private String link;

		public Linksfile(String link) {
			this.link = link;
		}

		public String getLink() {
			return link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		@Override
		public String toString() {
			return this.link;
		}
	}

}
