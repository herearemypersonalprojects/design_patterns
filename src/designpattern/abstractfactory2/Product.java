package designpattern.abstractfactory2;

public abstract class Product {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract ProductType getProductType();
	

	public Product(String filename) {
		
	}
}
