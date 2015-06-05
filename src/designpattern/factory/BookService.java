package designpattern.factory;

public class BookService extends Service {
	public Product getProduct(String filename) {
		Book book = new Book();		
		return book;
	}
}
