public class Fpractice {
	//Initialize a Field called sum
	private static int sum=5;
	
	//create a method called calcsum
	public static int calcSum(int val1, int val2){
			sum = sum + val1 + val2;
			return sum;
		}

	public static void main(String[] args) {
	
		//print out sum
		System.out.println(sum);
		
		//call the  calcSum method, save result in result, and print it out
		int result; 
		result = calcSum(10,20);
		System.out.println(result);
		
	}
}
	
