package questions;
//Program to print to number of objects created, question at: https://www.lintcode.com/problem/3426/
public class NumberOfObjects {
	public static void main(String args[]) {
	Teacher tec1=new Teacher();
	Students stu1= new Students();
	
	Teacher tec2=new Teacher();
	Students stu2= new Students();
	
	Teacher tec3=new Teacher();
	Students stu3= new Students();
	
	System.out.println(SchoolMember.number);
	}
	

}

class SchoolMember{
	String name;
	static int number;
}

class Teacher extends SchoolMember{
	int Salary;
	
	Teacher(){number++;} //Blank or default Constructor 
}

class Students extends SchoolMember{
	char Grade;
	Students(){
		number++;
	}
}