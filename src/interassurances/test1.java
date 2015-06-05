/**
 * interassurancesinterassurancestest1.java
 */
package interassurances;

/**
 * 
 * 
 * @version 1.0
 * 
 * @see 
 * @author Quoc-Anh LE
 * @copyright (C) Interassurances 2015
 * @date 9 avr. 2015
 * @notes
 * 
 */
class A {
	void m() {
		System.out.println("Voici A");
	}
}
class B extends A{
	void m() {
		System.out.println("Voici B");
	}
}
public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		A a = new B();
		a.m();
	}

}
