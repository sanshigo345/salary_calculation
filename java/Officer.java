public class Officer extends Personnel {
	
	private int ssBenefit = super.BASESALARY/100*65;
	
	public int calculateSalary(int week1, int week2, int week3, int week4, int yearOfStart) {
		int totalSalary = 0;
		// if blocks to calculate overWorkSalary
		if (week1 <= 50) {
			totalSalary += 20*(week1-40);
		}
		if (week1 > 50) {
			totalSalary += 200;
		}
		if (week2 <= 50) {
			totalSalary += 20*(week2-40);
		}
		if (week2 > 50) {
			totalSalary += 200;
		}
		if (week3 <= 50) {
			totalSalary += 20*(week3-40);
		}
		if (week3 > 50) {
			totalSalary += 200;
		}
		if (week4 <= 50) {
			totalSalary += 20*(week4-40);
		}
		if (week4 > 50) {
			totalSalary += 200;
		}
		// base salary + ssBenefit + severance for Officer
		totalSalary += super.BASESALARY + ssBenefit + (2020 - yearOfStart)*16;
		return totalSalary;
	}

}
