public abstract class Academician extends Personnel {
	
	protected int BASESALARY = super.BASESALARY;
	
	public abstract int calculateSalary(int week1, int week2, int week3, int week4, int yearOfStart);
	
}
