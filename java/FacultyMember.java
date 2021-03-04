public class FacultyMember extends Academician {
	
	private int ssBenefit = super.BASESALARY/100*135;
	
	@Override
	public int calculateSalary(int week1, int week2, int week3, int week4, int yearOfStart) {
		int totalSalary = 0;
		//if blocks to calculate addCourseFee
		if (week1 <= 48) {
			totalSalary += 20*(week1-40);
		}
		if (week1 > 48) {
			totalSalary += 160;
		}
		if (week2 <= 48) {
			totalSalary += 20*(week2-40);
		}
		if (week2 > 48) {
			totalSalary += 160;
		}
		if (week3 <= 48) {
			totalSalary += 20*(week3-40);
		}
		if (week3 > 48) {
			totalSalary += 160;
		}
		if (week4 <= 48) {
			totalSalary += 20*(week4-40);
		}
		if (week4 > 48) {
			totalSalary += 160;
		}
		// baseSalary + ssBenefit + severance for Faculty Member
		totalSalary += super.BASESALARY + ssBenefit + (2020 - yearOfStart)*16;
		return totalSalary;
	}

}
