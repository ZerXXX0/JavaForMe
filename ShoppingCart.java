package processing;

public class ShoppingCart{
	private double orderValue;
	private int productQuantity;
	public ShoppingCart() {}
	
	//1st way
//	public double pricePerProduct(){
////		if(this.productQuantity > 0) {
////			double averagePricePerProduct = this.orderValue / this.productQuantity;
////			return averagePricePerProduct;
////		}
////		else{
////			return -1.0;
////		}
//	double averagePricePerProduct;
//		try{
//			averagePricePerProduct = (int)this.orderValue / (int)this.productQuantity;
//		}
//		catch(ArithmeticException ex){
//			System.out.println("Warning error");
//			System.out.println("Exception in ShoppingCart.pricePerProduct");
//			averagePricePerProduct = 0;
//		}
//		return averagePricePerProduct;
//	}
	
	//2nd way
//	public double pricePerProduct() throws ArithmeticException{
//		double averagePricePerProduct = (int)this.orderValue/ (int)this.productQuantity;
//		return averagePricePerProduct;
//	}
	
	//3rd way
	public double pricePerProduct(){
		double averagePricePerProduct;
		try{
			averagePricePerProduct = (int)this.orderValue / (int)this.productQuantity;
		}
		catch(ArithmeticException ex){
			System.out.println("Exception in ShoppingCart.pricePerProduct");
			//averagePricePerProduct = 0;
			throw new ArithmeticException("Calculation not possible: empty");
		}
		return averagePricePerProduct;
	}
	
	public ShoppingCart(ShoppingCart oriShoppingCart){
		this.orderValue = oriShoppingCart.orderValue;
	}
	public double getOrderValue(){
		return orderValue;
	}
	public void setOrderValue(double orderValue){
		this.orderValue = orderValue;
	}
	public int getProductQuantity(){
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity){
		this.productQuantity = productQuantity;
	}
}
