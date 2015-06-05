package algorithmes;

abstract class A {
	public A() {
		System.out.println("A");
	}
}

class B extends A {
	public B() {
		System.out.println("B");
	}
	
	public B(int i) {
		System.out.println(i);
	}
}

public class Test {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1 == s2);
	}

}
