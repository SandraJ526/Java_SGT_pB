package lv.sandra;

import java.util.Scanner;

public class QuestionsAndAnswers {

	public static void main(String[] args) {
						
		String question1 = "Question 1 of 10 \n" 
							+ "Choose the best definition for a Class: \n"
							+ "A. An action for a program. \n"
							+ "B. An object definition, containing the data and function elements necessary to create an object. \n"
							+ "C. A group of students in a class. \n";
							// B
				Scanner userChoice = new Scanner (System.in);
				System.out.println(question1);
				System.out.println("Choose A, B or C.");
				String choiceAbC = userChoice.nextLine();
		
		String question2 = "Question 2 of 10 \n"
							+ "Given the declaration: int [ ] arr = {1,2,3,4,5}; What is the value of arr[3]? \n"
							+ "A. 3 \n"
							+ "B. 4 \n"
							+ "C. 5 \n";
							// B
				userChoice = new Scanner (System.in);
				System.out.println(question2);
				System.out.println("Choose A, B or C.");
				choiceAbC = userChoice.nextLine();
		
		String question3 = "Question 3 of 10 \n"
							+ "Choose the best definition of an object. \n"
							+ "A. A thing. \n"
							+ "B. Something you wear. \n"
							+ "C. An instance of a class. \n";
							// C
				userChoice = new Scanner (System.in);
				System.out.println(question3);
				System.out.println("Choose A, B or C.");
				choiceAbC = userChoice.nextLine();
							
		
		String question4 = "Question 4 of 10 \n"
							+ "What is the proper way to declare a variable? \n"
							+ "A. VariableName; \n"
							+ "B. VariableType variableName; \n"
							+ "C. VariableName variableType; \n";
							// B
				userChoice = new Scanner (System.in);
				System.out.println(question4);
				System.out.println("Choose A, B or C.");
				choiceAbC = userChoice.nextLine();
		
		String question5 = "Question 5 of 10 \n"
							+ "What is a loop?  \n"
							+ "A. A segment of code to be run infinite times. \n"
							+ "B. A segment of code to be run once.  \n"
							+ "C. A segment of code to be run a specified amount of times. \n";
							// C
				userChoice = new Scanner (System.in);
				System.out.println(question5);
				System.out.println("Choose A, B or C.");
				choiceAbC = userChoice.nextLine();
							
		String question6 = "Question 6 of 10 \n"
							+ "If classes Student, Staff and Faculty extend class Person, which one makes sense:  \n"
							+ "A. Person[] persons={new Faculty(), new Staff(), new Student()};  \n"
							+ "B. Faculty[] faculties={new Person(), new Faculty(), new Student()};  \n"
							+ "C. Staff[] staff={new Person(), new Staff(), new Student()};  \n";
							// A
				userChoice = new Scanner (System.in);
				System.out.println(question6);
				System.out.println("Choose A, B or C.");
				choiceAbC = userChoice.nextLine();
		
		String question7 = "Question 7 of 10 \n"
							+ "Which one needs a web page to run?  \n"
							+ "A. A Java Application  \n"
							+ "B. A Java Stand-Alone Application  \n"
							+ "C. A Java Applet  \n";
							// C
				userChoice = new Scanner (System.in);
				System.out.println(question7);
				System.out.println("Choose A, B or C.");
				choiceAbC = userChoice.nextLine();
		
		String question8 = "Question 8 of 10 \n"
							+ "What is the main function of any variable ?  \n"
							+ "A. To keep track of data in the memory of the computer  \n"
							+ "B. To print words on the screen  \n"
							+ "C. To add numbers together  \n";
							// A
				userChoice = new Scanner (System.in);
				System.out.println(question8);
				System.out.println("Choose A, B or C.");
				choiceAbC = userChoice.nextLine();;
		
		String question9 = "Question 9 of 10 \n"
							+ "Which of the following means that for the conditional to happen, \n"
							+ "either x must be less than 3 or y must be greater than or equal to 4?  \n"
							+ "A. If ((x < 3) || (y > = 4))  \n"
							+ "B. If ((x > 3) || (y < = 4))  \n"
							+ "C. If ((x < 3) && (y > 4))  \n";
							// A
				userChoice = new Scanner (System.in);
				System.out.println(question9);
				System.out.println("Choose A, B or C.");
				choiceAbC = userChoice.nextLine();
		
		String question10 = "Question 10 of 10 \n"
							+ "What is the role of the constructor? \n"
							+ "A. To create some type of change in the state of an object  \n"
							+ "B. Create an instance of a class (an object)  \n"
							+ "C. Create names for methods  \n";
							// B
				userChoice = new Scanner (System.in);
				System.out.println(question10);
				System.out.println("Choose A, B or C.");
				choiceAbC = userChoice.nextLine();
		
	}

}
