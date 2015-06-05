package designpattern.singleton;

public class Loggeur {
	private static Loggeur loggeur;
	
	private Loggeur() {
		// make constructor private to garantee that 
		// noone can create another instance of this class
	}
	
	private Object readResolve() {
		return loggeur;
	}
	
	public static Loggeur getLoggeur() {		
		if (loggeur == null) {
			synchronized(Loggeur.class) {
				loggeur = new Loggeur();
			}
		}
		return loggeur;
	}
}
