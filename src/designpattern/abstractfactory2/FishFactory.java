package designpattern.abstractfactory2;

public class FishFactory implements Factory {

	public Product getProduct(String filename) {
		return new Fish(filename);
	}

}
