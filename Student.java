import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Student {
	
	String firstName;
	String lastName;
	int age;
	Date dob;
	
	
	
	//public Date doob (int yyyy, int MM, int dd) {
		
		
	//	return myCalendar.getTime();
	//}
		
	public static Date parseDate (String date) {
		try {
			return new SimpleDateFormat("MM/dd/yyyy").parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

}
