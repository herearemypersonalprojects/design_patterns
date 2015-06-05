package designpattern.abstractfactory2;

public class Client {

	public static void main(String[] args) {
		Book book = (Book) new BookFactory().getProduct("");
		Fish fish = (Fish) new FishFactory().getProduct("");
		
		System.out.println(book.getProductType().getProductName());
		System.out.println(fish.getProductType().getProductName());
	}

}
