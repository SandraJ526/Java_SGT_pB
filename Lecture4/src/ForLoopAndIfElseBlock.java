
public class ForLoopAndIfElseBlock {

	public static void main(String[] args) {

		/**
		 * Array {3, 1, 2, 4} Using a loop and "if, else if, else" block find a number
		 * in the array and print out its name in console.
		 */

		int[] numbers = { 3, 1, 2, 4 };

		int findNumber = 1;
		String numberName = "ONE";
		boolean isInArray = false;
		

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == findNumber) {
				isInArray = true;
			} 
		}

		if (isInArray == true) {
			
				System.out.print(numberName);
			
								
		} else {
			System.out.println("Number not found");
		}

	}
	
}
