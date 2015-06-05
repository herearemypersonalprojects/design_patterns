package effective;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class Wine {
	String name() {return "wine";}
}

class Wine1 extends Wine {
	@Override String name() {return "wine1";}
}

class Wine2 extends Wine {
	@Override String name() {return "wine2";}
}

public class Overriding {
	
	static String classify(List<?> l) {
		return "list";
	}
	
	static String classify(Set<?> s) {
		return "set";
	}
	
	static String classify(Collection<?> s) {
		return "collection";
	}
	
	public static <T> List<T> gather(T... args) {
		return Arrays.asList(args);
	}
	
	public static void main(String[] args) {
		Wine[] wines = {new Wine(), new Wine1(), new Wine2()};
		for (Wine w : wines) {
			System.out.println(w.name());
		}
		
		Collection<?>[] cs = {new HashSet<String>(), new ArrayList<BigInteger>(), new HashMap<String, String>().values()};
		
		for (Collection<?> c : cs) {			
				System.out.println(classify(c));
			
		}
		
		List<String> s = Arrays.asList("mot", "hai", "ba");
		int[] is = {23, 4};
		System.out.println(s);
		System.out.println(gather(is));
		System.out.println(new Random().nextInt(323) );
	}
}
