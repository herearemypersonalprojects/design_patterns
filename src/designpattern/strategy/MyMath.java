package designpattern.strategy;

public class MyMath {
	private static class Cong implements Operation {
		public double operation(double a, double b) {			
			return a + b;
			}					
	};
	private static class Tru implements Operation {
		public double operation(double a, double b) {
			return a - b;
		}
	};
	
	public static Operation CONG = new Cong();

	public static Operation TRU = new Tru();
	
	public static double operation(double a, double b, Operation oper) {
		return oper.operation(a, b);
	}
	
}
