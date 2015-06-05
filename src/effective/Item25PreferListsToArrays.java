package effective;

import java.util.ArrayList;
import java.util.List;

public class Item25PreferListsToArrays {
	static <E> E reduce(List<E> list, Function<E> f, E initVal) {
		List<E> snapshot;
		synchronized(list) {
			snapshot = new ArrayList<E>(list);
		}
		E result = initVal;
		for (E e : snapshot) {
			result = f.apply(result, e);
		}
		return result;
		
	}
	
	public static void main (String[] args) {
		// Fails at runtime not at compile!
		Object[] objectArray = new Long[1];
		objectArray[0] = "I don't fit it";
		
		// Won't compile!
		List<Long> ol = new ArrayList<Long>();
		//ol.add("I don't");
		System.out.println("okk");
	}
}
