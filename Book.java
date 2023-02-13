package Product;

public class Book extends Product{
	private Author author;
	private String title;
	private double price;
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(float price){
		this.price = price;
	}
	public String getDescription(){
		String descriptionOfProduct = super.getDescription();
		return descriptionOfProduct 
				+ "Author : " + this.author.getAuthorName();
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author){
		this.author = author;
	}
	
	public Book(String title, double price){
		this.price = price;
		this.title = title;
	}
	
	public Book(){
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString(){
		String content = "\n" + "Product Name: " + title 
				+ "\n" + "Price: " + price +"\n";
		return content;
	}
	
	@Override
	public String getTwitterDescription(){
		// TODO Auto-generated method stub
		if(this.author == null) {
			return "Game : " + this.title + " by " + "Unknown";
		}
		else {
			return "Game : " + this.title + " by " + this.getAuthor();
		}
	}
	
}
