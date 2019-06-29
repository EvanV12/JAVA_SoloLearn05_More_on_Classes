package k_Anonymous_Classes;

public class MyClass {

	public static void main(String[] args) {
		
		Machine m1 = new Machine() {
			@Override public void start() {
				System.out.println("Wooooo");
			}
		};
		
		m1.start();
		// Outouts "Wooooo"
		
		
		Machine m2 = new Machine();
		m2.start();
		// Outputs "Starting..."

	}

}
