package questions;

import java.util.*;

//Program to print student info question given at: https://www.lintcode.com/problem/3357/
public class StudentInfoPrinter {
	public static void main(String args[]) {
		try{
			Scanner scan = new Scanner(System.in);
			Student student=readUserInput(scan);
			printStudentInfo(student);
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
		
		
	}
	private static Student readUserInput(Scanner scan) {
		System.out.println("Please enter the first name of student: ");
		String name=scan.next();
		System.out.println("Please enter the age of studen: ");
		int age=scan.nextInt();
		int marks[]=new int[3];
		for(int i=0;i<marks.length;i++) {
			System.out.println("Please enter the marks of "+(i+1)+"st subject:");
			marks[i]=scan.nextInt();
		}

		return new Student(name,age,marks);
}
	private static void printStudentInfo(Student student) {
		System.out.println("Name of student is: "+student.get_name());
		System.out.println("Age of student is: "+student.get_age());
		System.out.println("Maximum marks obtained by student is: "+student.get_course());
	}
}

class Student{
	//making variable as private to increase security 
	private final String name;
	private final int age;
	private final int[] marks;
	//Constructor 
	Student(String Name, int Age, int[] marks){
		this.name=Name;
		this.age=Age;
		this.marks= marks;
	}
	
	public String get_name() {
		return name;
	}
	public int get_age() {
		return age;
	}
	public int get_course() {
		int max = marks[0];
	    for (int mark : marks) {
	        if (mark > max) {
	            max = mark;
	        }
	    }
	    return max;
	}
}

	
