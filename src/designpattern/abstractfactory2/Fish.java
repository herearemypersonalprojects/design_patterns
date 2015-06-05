package designpattern.abstractfactory2;

public class Fish extends Product {

	public Fish(String xmlFileName) {
		super(xmlFileName);	
	}
	
	@Override
	public ProductType getProductType() {
		return ProductType.FIST;
	}

}
