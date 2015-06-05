package designpattern.abstractfactory;

public class FRENCHAddressFactory implements AddressFactoryInterface {

	public AddressAbstract createAddress() {
		return new FRENCHAddress();
	}

}
