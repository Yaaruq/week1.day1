package week1.day1;

public class Student {
	String studentName = "YAARUQ";
	int rollNo = 10;
	private void showCollege() {
		String name = "MADRAS UNIVERSITY";
		System.out.println("The Name of the college is "+name);
	}
	public static void main(String[] args) {
	Student a = new Student();
	System.out.println("The Roll number of the student is "+a.rollNo);
	System.out.println("The Name of the student is "+a.studentName);
	a.showCollege();
	}
}
