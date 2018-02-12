
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
		
		//converting third argument to display desired operation
		String operation = args[2];
		
		if(operation.equals("a")){
			operation = "add";
		}
		
		if(operation.equals("s")){
			operation = "subtract";
		}
		
		if(operation.equals("m")){
			operation = "multiply";
		}
		
		if(operation.equals("d")){
			operation = "divide";
		}
		
		//printing out results of input arguments
		System.out.println("Your first number was " + numone);
		System.out.println("Your second number was " + numtwo);
		System.out.println("You would like to " + operation + " these numbers");
		
		//perform requested operation
		if (operation.equals("add")){
			System.out.println("The answer is " + add(numone,numtwo) );
		}
		if (operation.equals("subtract")){
			System.out.println("The answer is " + subtract(numone,numtwo) );
		}
		if (operation.equals("multiply")){
			System.out.println("The answer is " + multiply(numone,numtwo) );
		}
		if (operation.equals("divide")){
			System.out.println("The answer is " + divide(numone,numtwo) );
		}
	
	}
	
	// addition method
	public static int add (int x, int y) {
		int result = x + y;
		return result;	
	}
	// subtraction method
	public static int subtract (int x, int y) {
		int result = x - y;
		return result;	
	}
	//multiplication method
	public static int multiply (int x, int y) {
		int result = x * y;
		return result;	
	}
	//division method
	public static int divide (int x, int y) {
		int result = x/y;
		return result;	
	}
	
}
