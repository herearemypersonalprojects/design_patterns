package designpattern.factory;

public class Book extends Product{
	public ProductType getProductType() {
		return ProductType.BOOK;
	}
}
