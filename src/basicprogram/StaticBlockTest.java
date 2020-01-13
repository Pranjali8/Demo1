package basicprogram;

public class StaticBlockTest {
	static int i=10;
	
	static {
		m1();
		System.out.println("i");
	}

	/*public static void main(String[] args) {
		m1();
		System.out.println("main method");
	}*/

	private static void m1() {
	System.out.println(i);
		
	}
	static {
		System.out.println("Second static Block");
	}
	static int j=20;
	
	
	

}
