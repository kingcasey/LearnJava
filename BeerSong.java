
public class BeerSong { 
	public static void main (String[] args) { 
		int beerNum = 99; 
		String word = "bottles"; 
		while (beerNum > 0) { 
			if (beerNum == 1) { 
				word = "bottle"; // singular, as in ONE bottle. 
				} 
			System.out.println( beerNum + " " + word + " of beer on the wall"); 
			System.out.println( beerNum + " " + word + " of beer."); 
			System.out.println(" Take one down."); 
			System.out.println(" Pass it around."); 
			beerNum = beerNum - 1; 
			//following code is added to correct 1 bottles of beer on the wall
			if (beerNum == 1) {
				word ="bottle";// singular, as in ONE bottle.
			}
			//end added code
			if (beerNum > 0) { 
				System.out.println( beerNum + " " + word + " of beer on the wall"); 
				} 
			else { 
				System.out.println(" No more bottles of beer on the wall"); 
				} // end else 
			} // end while loop 
		} // end main method
		
} // end class