
public class Day14 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.firstName = "Casey";
		student1.lastName = "King;";
		student1.age = 31;
		
		//Calendar cal = Calendar.getInstance();
		
		student1.dob = Student.parseDate("05/01/1980");  //cal.set (1999,10,19);//student1.doob(1980,10,13); 
		
	
		System.out.println ("Student Name: " + student1.firstName + " " + student1.lastName);
		System.out.println ("Student Age: " + student1.age);
		System.out.println ("Student DOB: " + student1.dob);

	}

}
