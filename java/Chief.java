public class Chief extends FullTimeEmployee {
	
	@Override
	public int calculateSalary(int week1, int week2, int week3, int week4, int yearOfStart) {
		int totalSalary = 0;
		// if blocks to calculate overWorkSalary
		if (week1 <= 48) {
			totalSalary += 15*(week1-40);
		}
		if (week1 > 48) {
			totalSalary += 120;
		}
		if (week2 <= 48) {
			totalSalary += 15*(week2-40);
		}
		if (week2 > 48) {
			totalSalary += 120;
		}
		if (week3 <= 48) {
			totalSalary += 15*(week3-40);
		}
		if (week3 > 48) {
			totalSalary += 120;
		}
		if (week4 <= 48) {
			totalSalary += 15*(week4-40);
		}
		if (week4 > 48) {
			totalSalary += 120;
		}
		// day of work + severance pay for Chiefs  
		totalSalary += 125*5*4 + (2020 - yearOfStart)*16; //125tl per day * 5days in a week * 4 weeks + severance
		return totalSalary;
	}

}
