package designpattern.factory;

public class ProductFactory implements Factory {

	public Product getProduct(String filename, Service service) {
		return service.getProduct(filename);
	}

}
