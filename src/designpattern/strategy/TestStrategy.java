package designpattern.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		double a = 13;
		double b = 3;
		System.out.println(MyMath.operation(a, b, MyMath.CONG));
		System.out.println(MyMath.operation(a, b, MyMath.TRU));
	}

}
