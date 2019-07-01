package n_The_equals_method;

public class MyClass {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Robby");
		Animal a2 = new Animal("Robby");
		
		System.out.println(a1.equals(a2));
		// Outputs true

	}

}
