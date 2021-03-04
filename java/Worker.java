public class Worker extends FullTimeEmployee {
	
	@Override
	public int calculateSalary(int week1, int week2, int week3, int week4, int yearOfStart) {
		int totalSalary = 0;
		// if blocks to calculate overWorkSalary
		if (week1 <= 50) {
			totalSalary += 11*(week1-40);
		}
		if (week1 > 50) {
			totalSalary += 110;
		}
		if (week2 <= 50) {
			totalSalary += 11*(week2-40);
		}
		if (week2 > 50) {
			totalSalary += 110;
		}
		if (week3 <= 50) {
			totalSalary += 11*(week3-40);
		}
		if (week3 > 50) {
			totalSalary += 110;
		}
		if (week4 <= 50) {
			totalSalary += 11*(week4-40);
		}
		if (week4 > 50) {
			totalSalary += 110;
		}
		// day of work + severance pay for Workers  
		totalSalary += 105*5*4 + (2020 - yearOfStart)*16; //105tl per day * 5days in a week * 4 weeks + severance
		return totalSalary;
	}

}
