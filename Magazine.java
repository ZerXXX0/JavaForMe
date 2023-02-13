package Product;

public class Magazine extends Book{
	private String subject;
	public String getDescription() {
		String descriptionOfBook = super.getDescription();
		return descriptionOfBook + "Book Type : "
				+ this.subject;
	}
	public String getsubject() {
		return subject;
	}
	public void setsubject(String subject) {
		this.subject = subject;
	}
}
