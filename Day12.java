
import java.math.BigDecimal;

public class Day12 {
			
	public static void main(String[] args) {	
		
		int hourlyPay = Integer.parseInt(args[0]);
		int weeklyHours = Integer.parseInt(args[1]);
		int weeksWorked = Integer.parseInt(args [2]);
		
		int weekNum = 1;
				
		int weeklyPay = hourlyPay * weeklyHours;
		int totalPayEarned = weeklyPay * weeksWorked;
		int totalSavings = 0;

		
		
		while (weekNum <= weeksWorked) {
			System.out.print("Week " + weekNum + " - Paycheck: $" + weeklyPay + "; ");
			
			double savePercent = 0;			
			
			if (weekNum % 10 == 0) {
				savePercent = .5;
			} else if (weekNum % 3 == 0){
				savePercent = .3;
			} else if (weekNum % 2 == 0){
				savePercent = .2;
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
