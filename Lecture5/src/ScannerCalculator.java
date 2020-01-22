import java.util.Scanner;

public class ScannerCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num1: ");
				int num1 = sc.nextInt();
				
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Choose operator + - * /  %  : ");
		String operator = sc.nextLine();
		
		int result = 0;
		
		if (operator.equals ("+")) { // .equals operates the same as ==
			result = num1 + num2;
		} else if (operator.equals ("-")){
			result = num1 - num2;
		}else if (operator.equals ("/")) {
			result = num1 / num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("%")) {
			result = num1 % num2; 
		}
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		
		
				

	}

}
