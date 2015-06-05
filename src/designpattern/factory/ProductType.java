package designpattern.factory;

public enum ProductType {
	BOOK("book"),
	FIST("fish");
	
	final private String productName;
	
	private ProductType(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return this.productName;
	}
}
