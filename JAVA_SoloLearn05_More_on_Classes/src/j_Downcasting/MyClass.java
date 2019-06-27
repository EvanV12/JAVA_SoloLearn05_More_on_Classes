package j_Downcasting;

public class MyClass {

	public static void main(String[] args) {
		
		// Upcasting
		Animal a = new Cat();
		
		
		// Downcasting
		Animal b = new Cat();
		((Cat)b).makeSound();
		// Outputs "Meow"

	}

}
