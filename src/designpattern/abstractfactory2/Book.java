package designpattern.abstractfactory2;

public class Book extends Product {
	
	public Book(String xmlFileName) {
		super(xmlFileName);
	}
	
	@Override
	public ProductType getProductType() {
		return ProductType.BOOK;
	}

}
