import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner scannerInput = new Scanner (System.in);
		
		
		System.out.println("Enter number:");
		int number = scannerInput.nextInt();
		scannerInput.nextLine();
		System.out.println("Enter name:");
		String name = scannerInput.nextLine();
		
		
		
		System.out.println("Your number is " + number);
		System.out.println("Your name is " + name);
		
		
		
	}

}
