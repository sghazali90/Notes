public class Restaurant2 {

	// Create a method to print an array to screen
	public static void printArray(String array[]) {
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
	}

	public static void main(String[] args) {

		// Number of people to be seated
		int party = 5;

		// Call the greet method in the Hostess class
		Hostess2.greet(party);

		// Drinks Order
		String[] drinks;
		drinks = Waitstaff.getDrinks(party);

		System.out.println("Here are the drinks you ordered: ");
		// Print the array of drinks
		printArray(drinks);

		//Food Order
		String[] food;
		food= Waitstaff.getFood(party);
		
		System.out.println("Here is what you ordered: ");
		// Print the array of food orders
		printArray(food);
		
		
	}

}
