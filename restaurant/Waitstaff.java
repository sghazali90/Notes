import java.util.Scanner;

public class Waitstaff {

	//Create a method to get the drinks order
	public static String [] getDrinks(int num){
		System.out.println("Hi, can I get you some drinks?");
		
		//while loop that asks all members what they want to drink
		int i= 0;
		String[ ] drinkOrder = new String[num];
		
		while (i<num) {
			System.out.println("What would you like?");
			Scanner input = new Scanner(System.in);
			String temp = input.nextLine( );
			drinkOrder[i] = new String(temp);
			i= i +1; 
		}
		return drinkOrder; 
	}
}
