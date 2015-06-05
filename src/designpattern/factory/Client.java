package designpattern.factory;

public class Client {

	public static void main(String[] args) {
		ProductFactory productFactory = new ProductFactory();
		
		Book book = (Book) productFactory.getProduct("", new BookService());
		Fish fish = (Fish) productFactory.getProduct("", new FishService());
		
		System.out.println(book.getProductType().getProductName());
		System.out.println(fish.getProductType().getProductName());
	}

}
