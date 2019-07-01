package o_Enums;

public class MyClass {
	
	public static void main(String[] args) {
		
		Rank a = Rank.SOLDIER;
		
		
		switch(a) {
		case SOLDIER:
			System.out.println("Soldier says hi!");
			break;
		case SERGEANT:
			System.out.println("Sergeant says Hello!");
			break;
		case CAPTAIN:
			System.out.println("Captain says Welcome!");
			break;
		}
		
		// Outputs "Soldier says hi!"

	}

}
