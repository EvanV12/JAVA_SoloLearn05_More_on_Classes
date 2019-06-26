package d_Polymorphism;

public class MyClass {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		Animal b = new Cat();
		
		a.makeSound();
		// Outputs "Woof"
		
		b.makeSound();
		//Outputs "Meow"
		

	}

}
