package designpattern.abstractfactory;

public abstract class AddressAbstract {
	private String address;
	
	void setAddress(String address) {
		this.address = address;
	}
	
	String getAddress() {
		return this.address;
	}
	
	abstract String getPostalCode();
}
