package designpattern.factory;

public interface Factory {
	Product getProduct(String filename, Service service);
}
