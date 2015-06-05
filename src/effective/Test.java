package effective;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
	
	public static List<Integer> asList(final int[] a) {
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				return a[index];
			}
			
			@Override
			public Integer set(int i, Integer val) {
				Integer oldVal = a[i];
				a[i] = val;
				return oldVal;				
			}

			@Override
			public int size() {
				return a.length;
			}
			
		};
	}
	
	public static List<Integer> asList2(final Integer[] a) {
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				return a[index];
			}
			
			@Override
			public Integer set(int i, Integer val) {
				Integer oldVal = a[i];
				a[i] = new Integer(1);
				return oldVal;				
			}

			@Override
			public int size() {
				return a.length;
			}
			
		};
	}	
	
	public static void test1() {
		List<Integer> lst = Test.asList(new int[10000000]);
		long currentTime = System.currentTimeMillis();
		for (int i = 0; i< 1000000; i++) {
			lst.set(i, i);
			lst.get(i);
		}
		long passedTime = System.currentTimeMillis() - currentTime;
		System.out.println(passedTime);		
	}
	
	public static void test2() {
		List<Integer> lst = Test.asList2(new Integer[10000000]);
		long currentTime = System.currentTimeMillis();
		for (int i = 0; i< 1000000; i++) {
			lst.set(i, i);
			lst.get(i);
		}
		long passedTime = System.currentTimeMillis() - currentTime;
		System.out.println(passedTime);		
	}
	

	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> s = new HashSet<E>(s1);
		s.addAll(s2);
		return s;
	}
	
	public static <K,V> HashMap<K, V> newHashMap() {
		return new HashMap<K,V>();
	}
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		Iterator<T> i = list.iterator();
		T result = i.next();
		while (i.hasNext()) {
			T t = i.next();
			if (t.compareTo(result) > 0) {
				result = t;
			}
		}
		return result;
	}

	public static void swap(List<?> list, int i, int j) {
		swapHelper(list, i, j);
	}
	
	private static <E> void swapHelper(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}
	
	public static <E> void func1(final List<E> list) {
		list.add(list.get(0));
	}
	
	public static void funct2(final List<?> list) {
		func1(list);
	}
	
	
	public static void fun(List<?> sf) {
		System.out.println("ok");
	}
	
	
	public static <L> void main(String[] args) {	
		
		List<String> s = new ArrayList<String>();
		fun(s);
	}

}
