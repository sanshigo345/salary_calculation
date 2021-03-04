public class PartTimeEmployee extends Personnel {
	
	
	public int calculateSalary(int week1, int week2, int week3, int week4, int yearOfStart) {
		int totalSalary = 0;
		// if blocks to calculate hourOfWork 
		if (week1 >= 10 && week1 <= 20) {
			totalSalary += week1*18;
		}
		if (week1 > 20) {
			totalSalary += 20*18;
		}
		if (week2 >= 10 && week2 <= 20) {
			totalSalary += week2*18;
		}
		if (week2 > 20) {
			totalSalary += 20*18;
		}
		if (week3 >= 10 && week3 <= 20) {
			totalSalary += week3*18;
		}
		if (week3 > 20) {
			totalSalary += 20*18;
		}
		if (week4 >= 10 && week4 <= 20) {
			totalSalary += week4*18;
		}
		if (week4 > 20) {
			totalSalary += 20*18;
		}
		// + severance pay for part time employees
		totalSalary += (2020 - yearOfStart)*16;
		return totalSalary;
	}

}
