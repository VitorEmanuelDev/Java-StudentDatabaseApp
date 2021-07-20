package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 700;
	private static int id = 1001;
	
	//Constructor: prompt user to enter student's name and year
		public Student() {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter student first name: ");
			this.firstName = scanner.nextLine();
			
			System.out.println("Enter student last name: ");
			this.lastName = scanner.nextLine();
			
			System.out.println("1. First year\n2. Second year\n3. Third year\n4. Fourth year\nEnter student level: ");
			this.gradeYear = scanner.nextInt();
			
			setStudentID();
					
			System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
			scanner.close();
			
						
		}
	//Generate an ID
		private void setStudentID() {
			
			id++;
			//Grade level + String + ID. it will become a string
			this.studentID = gradeYear + "" + id;
			
		}
		
	//Enroll in courses
		public void Enroll() {
			
			System.out.println("Enter course to enroll (0 to quit): ");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			scanner.close();
			
			if(course != "Q") {
				
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
				
			}
			
			System.out.println("ENROLLED IN: " + courses);
			System.out.println("TUITION BALANCE: " + tuitionBalance);
			
		}
	
	//View balance
	
	//Pay tuition
	
	//Show status
	
}
