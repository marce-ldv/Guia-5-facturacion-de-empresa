package domain;

public class Product {
	
	private String productName;
	private double price;
	
	public Product(String productName,double unitPrice) {
		this.productName=productName;
		this.price=unitPrice;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getProductPrice() {
		return price;
	}
	
	

}
