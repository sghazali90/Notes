
public class Restaurant2 {
	
	//Create a method to print an array to screen
	public static void printArray(String array[]){
		for (int i = 0; i < array.length; i++) {
			 if (i > 0) {
				 System.out.print(", ");
		         }
			 	System.out.print(array[i]);
		      }
	}
	
	
	public static void main(String[] args) {

		//Number of people to be seated
		int party = 5; 
		
		//Call the greet method in the Hostess class
		Hostess2.greet(party);
		
		//Call the  getDrinks method in the Server class
		String[ ] drinks;
		drinks = Waitstaff.getDrinks(party);
		
		//Print the array of drinks
		printArray(drinks);
	}

}
