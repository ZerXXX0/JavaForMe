package Product;

public abstract class Product{
	protected String manufacturer;
	protected String title;
	protected String productNumber;

	public abstract String getTwitterDescription();
	public String getDescription() {
		return "Product Number : " + this.productNumber
				+ "Manufacturer : " + this.manufacturer
				+ "Title : " + this.title;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
}
