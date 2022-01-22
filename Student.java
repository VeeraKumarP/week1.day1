package week1.day1;

public class Student {
public String studentName = "Veera";
private int rollNumber = 1234;

public void College() {
	String name = "Sri Venkateswara University";
	System.out.println("College Name :" +name);
	
}
public static void main(String[] args) {
	Student myObj=new Student();
	myObj.College();
	String name = myObj.studentName;
	int number = myObj.rollNumber;
	System.out.println("Student Name : " +name);
	System.out.println("Student RollNumber:" +number);
}
}
