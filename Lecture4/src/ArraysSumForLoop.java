
public class ArraysSumForLoop {

	public static void main(String[] args) {

		int[] marks = { 76, 23, 42 };
		// Sum all values in arrays
		// Print in console

//		int result = 10;
//		System.out.println("Result value: " + result);
//		
//		int testInt = 90;
//		result = 200;
//		
//		System.out.println("Result value: " + result);

		int sum = 0;

		for (int i = 0; i < marks.length; i++) {

			sum += marks[i];

		}

		System.out.println("Sum of marks: " + sum);

		System.out.println(marks[0] + marks[1] + marks[2]);

		int sumTest = 0;
		sumTest = sumTest + 200;
		sumTest += 220;
		sumTest = sumTest + 240;
		System.out.println("Testing += operator: " + sumTest);
		
		int substractTest = 0;
		substractTest = substractTest - 200;
		substractTest -= 220;
		substractTest -= 240;

		System.out.println("Testing -= operator: " + substractTest);
		
	
	}

}
