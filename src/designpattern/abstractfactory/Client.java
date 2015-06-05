/**
 * interassurancesdesignpatternClient.java
 */
package designpattern.abstractfactory;

/**
 * 
 * 
 * @version 1.0
 * 
 * @see 
 * @author Quoc-Anh LE
 * @copyright (C) Interassurances 2015
 * @date 5 mai 2015
 * @notes
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		USAAddress usaAddress = (USAAddress) new USAAddressFactory().createAddress();
		FRENCHAddress frenchAddress = (FRENCHAddress) new FRENCHAddressFactory().createAddress();
		
		System.out.println("French postal code: " + frenchAddress.getPostalCode());
		System.out.println("USA postal code: " + usaAddress.getPostalCode());
	}

}
