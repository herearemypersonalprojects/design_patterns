package effective;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;

public class SingletonSerializable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1830347973862679997L;
	public static final SingletonSerializable INSTANCE = new SingletonSerializable();
	private SingletonSerializable() {};
	
	private String[] favoriteSongs = {"mot", "hai", "ba"};
	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}
	
	private Object readResolve() throws ObjectStreamException {
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		SingletonSerializable.INSTANCE.printFavorites();
	}
}
