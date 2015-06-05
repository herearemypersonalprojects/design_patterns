package designpattern.factory;

public class FishService extends Service{
	public Product getProduct(String filename) {
		Fish fish = new Fish();
		// read filename here
		return fish;
	}
}
