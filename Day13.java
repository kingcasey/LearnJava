
public class Day13 {
	
	public static void main(String[] args) {

	//handling intake of first two arguments
			int numone = 0;
			int numtwo = 0;
			int result = 0;
			
			if (args.length == 2){
				try {
					numone = Integer.parseInt(args[0]);
				}
				catch (NumberFormatException nfe) {
					System.out.println("The first and second argument must be an integer.");
					System.exit(1);
				}
				
				//int result = 0;
				String operation = args[1];
				
				switch (args[1]){
				case "s" : operation = "subtract"; 
						result = subtract(numone);
				break;
				case "a" : operation = "add";
						result = add(numone);
				break;
				case "m" : operation = "multiply";
						result = multiply(numone);
				break;
				case "d" : operation = "divide";
						result = divide(numone);
				}
				
				//printing out results of input arguments
				System.out.println("Your first number was " + numone);
				System.out.println("No second number so we will use " + numone);
				System.out.println("You would like to " + operation + " these numbers");
				System.out.println("The answer is " + result);
				
				
				
			} else {
			
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
			//int result = 0;
			String operation = args[2];
			
			switch (args[2]){
			case "s" : operation = "subtract"; 
					result = subtract(numone,numtwo);
			break;
			case "a" : operation = "add";
					result = add(numone, numtwo);
			break;
			case "m" : operation = "multiply";
					result = multiply(numone, numtwo);
			break;
			case "d" : operation = "divide";
					result = divide(numone, numtwo);
			}
			
			//printing out results of input arguments
			System.out.println("Your first number was " + numone);
			System.out.println("Your second number was " + numtwo);
			System.out.println("You would like to " + operation + " these numbers");
			System.out.println("The answer is " + result);
			}//end else statement
	}
	
	static int add (int numone,int numtwo) {
		return numone + numtwo;
	}
	
	static int add (int numone) {
		return numone + numone;
	}
	
	static int subtract (int numone,int numtwo) {
		return numone - numtwo;
	}
	
	static int subtract (int numone) {
		return numone - numone;
	}
	
	static int multiply (int numone,int numtwo) {
		return numone * numtwo;
	}
	
	static int multiply (int numone) {
		return numone * numone;
	}
	
	static int divide (int numone,int numtwo) {
		return numone / numtwo;
	}
	
	static int divide (int numone) {
		return numone/numone;
	}

}
