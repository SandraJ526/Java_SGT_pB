

public class ArraysAndLoop {

	public static void main(String[] args) {

		// Declare variable
		int[] marks = { 76, 23, 42, 100, 99, 10, 56 };
		// Make toString all elements of array
		// Print in console
		//println - print new line
		//print - print in one line

//		System.out.println(marks[0]);

		for (int i = 0; i < marks.length; i++) {

			System.out.println(marks[i]);
		}

		System.out.print("[");
		for (int i = 0; i < marks.length-1; i++) {

			System.out.print(marks[i] + ", ");
		}
		System.out.print(marks[marks.length-1]+ "]");
		
		System.out.println("\n" + marks.length);
		System.out.println(marks.length-1);
		System.out.println(marks [4]);
	}
	
	

}
