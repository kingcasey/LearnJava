
public class HumanCalculator {

	public static void main(String[] args) {
		
		//handling intake of first two arguments
		int numone = 0;
		int numtwo = 0;
		
		//converting first two argument to integers
		try {
		numone = Integer.parseInt (args[0]);
		numtwo = Integer.parseInt (args[1]);
		}
		
		//error handling of first two arguments
		catch (NumberFormatException nfe) {
			System.out.println("The first and second argument must be an integer.");
			System.exit(1);
		}
		
		//converting third argument to display desired operation; also complete operation
		String operation = args[2];
		int result = 0;
		
		if(operation.equals("a")){
			operation = "add";
			result = numone + numtwo;
		}
		
		if(operation.equals("s")){
			operation = "subtract";
			result = numone - numtwo;
		}
		
		if(operation.equals("m")){
			operation = "multiply";
			result = numone*numtwo;
		}
		
		if(operation.equals("d")){
			operation = "divide";
			result = numone/numtwo;
		}
		
		//printing out results of input arguments
		System.out.println("Your first number was " + numone);
		System.out.println("Your second number was " + numtwo);
		System.out.println("You would like to " + operation + " these numbers");
		System.out.println("The answer is " + result);
		
	}
}
