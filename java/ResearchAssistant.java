public class ResearchAssistant extends Academician {
	
	private int ssBenefit = super.BASESALARY/100*105;
	
	@Override
	public int calculateSalary(int week1, int week2, int week3, int week4, int yearOfStart) {
		int totalSalary = 0;
		totalSalary += super.BASESALARY + ssBenefit + (2020 - yearOfStart)*16;
		return totalSalary;
	}

}
