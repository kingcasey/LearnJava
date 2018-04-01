
public class Day15 {

	public static void main(String[] args) {
		Student student2 = new Student();
		student2.firstName = "Ronnie";
		student2.lastName = "King;";
		student2.age = 37;		
		student2.dob = Student.parseDate("05/01/1980");  
		
		Student student3 = new Student();
		student3.firstName = "Casey";
		student3.lastName = "King;";
		student3.age = 34;		
		student3.dob = Student.parseDate("10/04/1983");
	
		System.out.println ("Student Name: " + student2.firstName + " " + student3.lastName);
		System.out.println ("Student Age: " + student2.age);
		System.out.println ("Student DOB: " + student2.dob);

		System.out.println ("Student Name: " + student3.firstName + " " + student3.lastName);
		System.out.println ("Student Age: " + student3.age);
		System.out.println ("Student DOB: " + student3.dob);

	}

}
