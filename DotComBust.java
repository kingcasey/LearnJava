
import java.util.*;
public class DotComBust {
	
	
	//declare and initialize the variables needed
	//create a new game helper object, a new list of dotcoms and a variable to hold the number of guesses a user makes
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		
		//  make three dotcom objects, name them and add them to the array list of dotcoms
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		//print brief instructions for the user
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		for(DotCom dotComToSet : dotComsList) { //repeat with each dotcom in the list
			ArrayList<String> newLocation = helper.placeDotCom(3); //ask the helper for a dotcom location
			dotComToSet.setLocationCells(newLocation);//call the setter method on this DotCom to give it the location from the helper
		}//close for Loop
	}//close setUpGame method
	
	private void startPlaying() {
		while(!dotComsList.isEmpty()) {// as long as the DotCom list is Not Empty
			String userGuess = helper.getUserInput("Enter a guess");//get user input
			checkUserGuess(userGuess); //call our own checkUserGuess method
		}//close while loop
		finishGame(); //call our own finish game method
	}//close startPlaying method
	
	private void checkUserGuess (String userGuess) {
		
		numOfGuesses++; //increment tht number of guesses the user has made
		String result = "miss"; //assume its a 'miss', unless told otherwise
		
		for (DotCom dotComToTest : dotComsList) {//repeat with all dotcoms in the list
			result = dotComToTest.checkYourself(userGuess); //ask the dotcom to check the user guess, looking for o hit or a kill
			if (result.equals("hit")) {
				break;//get out of the loop early, no point in testing the others
			}
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);//this guy's dead so take him out of the dotcoms list then get out of the loop
				break;
			}
		}//close for loop
		
		System.out.println(result); //print the result for the user
	}// close checkUserGuess method
	
	private void finishGame() { //print a message telling the user how he did in the the game
		System.out.println("All Dot Coms are dead; Your stock is now worthless.");
		if (numOfGuesses <=18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}// close finishGame method
	
	public static void main (String [] args) {
		DotComBust game = new DotComBust (); //create the game object
		game.setUpGame(); //tell the game object to set up the game
		game.startPlaying(); //tell the game object to start the main game play loop
	}//close main method
}
