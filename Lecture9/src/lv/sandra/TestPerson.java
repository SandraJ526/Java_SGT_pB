package lv.sandra;

import lv.sandra.users.Teacher;

public class TestPerson {

	public static void main(String[] args) {

		String[] stringArray = new String[12];
		stringArray[0] = "Sport";
		stringArray[1] = "Math";

		System.out.println(stringArray[0] + " " + stringArray[1]);

		Teacher teacher1 = new Teacher("Toms", "Riga");
		System.out.println(teacher1.toString());

//		teacher1.addCourse("Sport");
//		teacher1.addCourse("Math");
//		teacher1.addCourse("Biology");
//		teacher1.addCourse("History");

		String[] courses = { "Sport", "Math", "Biology", "History" };

		// for each loop
		for (String course : courses) {
			teacher1.addCourse(course);

		}
		
		Teacher t1 = new Teacher ("Toms B", "Rigas iela");
		System.out.println(t1.toString());
		String [] coursesForT1 = {"CS10", "AL", "BIO", "CS10"};
		for(String core : coursesForT1) {
			if(t1.addCourses(core)) {
				System.out.println(core + " has been added");
				
			} else {
				System.out.println(core + " cannot be added");
			}
		}
		
		for(String core : coursesForT1) {
			if(t1.removeCourses(core)) {
				System.out.println(core + " has been removed");
				
			} else {
				System.out.println(core + " cannot be removed");
			}
		}

	}

}
