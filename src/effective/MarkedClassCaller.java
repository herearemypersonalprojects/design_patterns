package effective;

public class MarkedClassCaller {

	
	public static <L> void main(String[] args) {		
		MarkedClassCaller.display(new MarkedClass());
		System.out.println("ok");
	}
	
	public static void display(MarkerInterface instance) {
	
	}
}
