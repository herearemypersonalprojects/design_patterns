package designpattern.abstractfactory;

public class USAAddressFactory implements AddressFactoryInterface {

	public AddressAbstract createAddress() {		
		return new USAAddress();
	}

}
