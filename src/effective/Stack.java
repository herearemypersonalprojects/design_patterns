package effective;

import java.util.EmptyStackException;

public class Stack<E> {
	private E[] elements;
	private int size = 0;
	private static final int CAPACITY = 10;
	
	@SuppressWarnings("unchecked")
	public Stack() {
		elements = (E[]) new Object[CAPACITY];		
	}
	
	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	public E pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		E e = elements[--size];
		elements[size] = null;
		return e;
	}
	
	public boolean isEmpty() {
		return (size == 0?true:false);
	}
	
	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if (size == elements.length) {
			elements = (E[]) new Object[CAPACITY*2 + 1];
		}
	}
	
	public static <L> void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i< 10; i++) {
			stack.push(i);
		}
		while (! stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
}
