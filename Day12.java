

public class Day12 {
			
	public static void main(String[] args) {	
		
		int hourlyPay = Integer.parseInt(args[0]);
		int weeklyHours = Integer.parseInt(args[1]);
		int weeksWorked = Integer.parseInt(args [2]);
		
		int weekNum = 1;
				
		int weeklyPay = hourlyPay * weeklyHours;
		int totalPayEarned = weeklyPay * weeksWorked;
		int totalSavings = 0;

		
		
		while (weekNum <= weeksWorked) { //keep counting paycheck + savings weekly starting with week 1 until all worked weeks have been calculated
			System.out.print("Week " + weekNum + " - Paycheck: $" + weeklyPay + "; ");
			
			double savePercent = 0;	
			
			int leftOver = weekNum % 10;
			
			switch(leftOver){
				case 0: savePercent = .5;
				break;
				case 3: savePercent = .3;
				break;
				case 2: savePercent = .2;
				break;
				case 4: savePercent = .2;
				break;
				case 6: savePercent = .3;
				break;
				case 8: savePercent = .2;
				break;
				case 9: savePercent = .3;
				break;
			}
			
			int saveAmount = (int) (savePercent * weeklyPay);
			int payAfterSavings = weeklyPay - saveAmount;
			
			System.out.print("Saved: $" + saveAmount + "; ");
			System.out.print("Paycheck After Savings: $" + payAfterSavings + "; ");
			
			
			
			totalSavings = totalSavings + saveAmount;
			
			System.out.println("Savings Balance: $" + totalSavings);
			weekNum ++;
		}
		
		System.out.println("Total Pay Earned: $" + totalPayEarned);
	}
	

}
