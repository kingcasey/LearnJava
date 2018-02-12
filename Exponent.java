
public class Exponent {

	public static void main(String[] args) {
		
		//handling intake of first two arguments
		int base = 0;
		int exponent = 0;
				
		//converting first two argument to integers
		try {
		base = Integer.parseInt (args[0]);
		exponent = Integer.parseInt (args[1]);
		}
				
		//error handling of first two arguments
		catch (NumberFormatException nfe) {
			System.out.println("The base and exponent must be an integer.");
			System.exit(1);
		}
		int result = base;		
		
		
		for (int x=1; x<exponent; x++){
		
			result = result * base;
			
		}
		
		if (result < 100){
			
		System.out.println(result);
		}
		else {
			System.out.println("The result is too big to print.");
		}
	}

}
