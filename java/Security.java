public class Security extends Personnel {
		
	public int calculateSalary(int week1, int week2, int week3, int week4, int yearOfStart) {
		int totalSalary = 0;
		// if blocks to calculate hourOfWork & food money & transportation money 
		if (week1 >= 30 && week1 <= 54) {
			totalSalary += 15*6; // food + transportation money * 6 days
			totalSalary += week1*10;
		}
		if (week1 > 54) { // if security works more than 9 hours per day he/she gets 540TL maximum for that week (NO OVER WORK SALARY)
			totalSalary += 54*10;
		}
		if (week2 >= 30 && week2 <= 54) {
			totalSalary += 15*6;
			totalSalary += week2*10;
		}
		if (week2 > 54) {
			totalSalary += 54*10;
		}
		if (week3 >= 30 && week3 <= 54) {
			totalSalary += 15*6;
			totalSalary += week3*10;
		}
		if (week3 > 54) {
			totalSalary += 54*10;
		}
		if (week4 >= 30 && week4 <= 54) {
			totalSalary += 15*6;
			totalSalary += week4*10;
		}
		if (week4 > 54) {
			totalSalary += 54*10;
		}
		// + severance pay for security
		totalSalary += (2020 - yearOfStart)*16;
		return totalSalary;
	}

}
