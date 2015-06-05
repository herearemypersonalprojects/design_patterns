package designpattern.abstractfactory2;

public class BookFactory implements Factory {

	public Product getProduct(String filename) {
		return new Book(filename);
	}

}
