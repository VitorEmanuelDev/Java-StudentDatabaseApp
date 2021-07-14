package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private int studentID;
	private String tuitonBalance;
	private int costOfCourse = 1000;
	
	//Constructor: prompt user to enter student's name and year
		public Student() {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter student first name: ");
			this.firstName = scanner.nextLine();
			
			System.out.println("Enter student last name: ");
			this.lastName = scanner.nextLine();
			
			System.out.println("1. First year\n2. Second year\n3. Third year\n4. Fourth year\nEnter student level: ");
			this.gradeYear = scanner.nextLine();
			
			System.out.println(firstName + " " + lastName + " " + gradeYear);
			
			
		}
	//Generate an ID
		
	//Enroll in courses
	
	//View balance
	
	//Pay tuition
	
	//Show status
	
}
