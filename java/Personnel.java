import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Personnel {
	// VARIABLES 
	private String[] personnelLine;
	private String[] monitoringLine;
	private String name;
	private String surname;
	private String registerNumber;
	private String position;
	private int yearOfStart;
	private int week1;
	private int week2;
	private int week3;
	private int week4;
	private char personnelType;
	private int salary;
	protected int BASESALARY = 2600;
	// VARIABLES
	
	//This method loops through given files, set variables, and call necessary classes/methods and then finally creates text output files.
	public void createOutput(String file1, String file2) throws IOException {		
		String[] lines1 = ReadFromFile.readFile(file1);
		String[] lines2 = ReadFromFile.readFile(file2);
		
		for (int i=0; i<lines1.length; i++) {
			
			//Setting Variables
			personnelLine = lines1[i].split("\t");
			name = personnelLine[0].split(" ")[0];
			surname = personnelLine[0].split(" ")[1];
			registerNumber = personnelLine[1];
			position = personnelLine[2];
			yearOfStart = Integer.parseInt(personnelLine[3]);
			personnelType = registerNumber.charAt(0);
			
			monitoringLine = lines2[i].split("\t");
			week1 = Integer.parseInt(monitoringLine[1]);
			week2 = Integer.parseInt(monitoringLine[2]);
			week3 = Integer.parseInt(monitoringLine[3]);
			week4 = Integer.parseInt(monitoringLine[4]);
			
			//Switch case for every type of personnel
			switch (personnelType) {
			case 'F':
				FacultyMember FM = new FacultyMember();
				salary = FM.calculateSalary(week1, week2, week3, week4, yearOfStart);
				BufferedWriter writerFM = new BufferedWriter(new FileWriter(registerNumber + ".txt"));
				writerFM.write("Name : " + name + "\n" + "Surname : " + surname + "\n" + 
						"Registiration Number : " + registerNumber + "\n" + "Position : " + position + "\n" + 
						"Year of Start : " + yearOfStart + "\n" + "Total Salary : " + salary + ".00TL");
				writerFM.close();
				break;
			case 'R':
				ResearchAssistant RA = new ResearchAssistant();
				salary = RA.calculateSalary(week1, week2, week3, week4, yearOfStart);
				BufferedWriter writerRA = new BufferedWriter(new FileWriter(registerNumber + ".txt"));
				writerRA.write("Name : " + name + "\n" + "Surname : " + surname + "\n" + 
						"Registiration Number : " + registerNumber + "\n" + "Position : " + position + "\n" + 
						"Year of Start : " + yearOfStart + "\n" + "Total Salary : " + salary + ".00TL");
				writerRA.close();
				break;
			case 'O':
				Officer O = new Officer();
				salary = O.calculateSalary(week1, week2, week3, week4, yearOfStart);
				BufferedWriter writerO = new BufferedWriter(new FileWriter(registerNumber + ".txt"));
				writerO.write("Name : " + name + "\n" + "Surname : " + surname + "\n" + 
						"Registiration Number : " + registerNumber + "\n" + "Position : " + position + "\n" + 
						"Year of Start : " + yearOfStart + "\n" + "Total Salary : " + salary + ".00TL");
				writerO.close();
				break;
			case 'W':
				Worker W = new Worker();
				salary = W.calculateSalary(week1, week2, week3, week4, yearOfStart);
				BufferedWriter writerW = new BufferedWriter(new FileWriter(registerNumber + ".txt"));
				writerW.write("Name : " + name + "\n" + "Surname : " + surname + "\n" + 
						"Registiration Number : " + registerNumber + "\n" + "Position : " + position + "\n" + 
						"Year of Start : " + yearOfStart + "\n" + "Total Salary : " + salary + ".00TL");
				writerW.close();
				break;
			case 'C':
				Chief C = new Chief();
				salary = C.calculateSalary(week1, week2, week3, week4, yearOfStart);
				BufferedWriter writerC = new BufferedWriter(new FileWriter(registerNumber + ".txt"));
				writerC.write("Name : " + name + "\n" + "Surname : " + surname + "\n" + 
						"Registiration Number : " + registerNumber + "\n" + "Position : " + position + "\n" + 
						"Year of Start : " + yearOfStart + "\n" + "Total Salary : " + salary + ".00TL");
				writerC.close();
				break;
			case 'P':
				PartTimeEmployee PTE = new PartTimeEmployee();
				salary = PTE.calculateSalary(week1, week2, week3, week4, yearOfStart);
				BufferedWriter writerPTE = new BufferedWriter(new FileWriter(registerNumber + ".txt"));
				writerPTE.write("Name : " + name + "\n" + "Surname : " + surname + "\n" + 
						"Registiration Number : " + registerNumber + "\n" + "Position : " + position + "\n" + 
						"Year of Start : " + yearOfStart + "\n" + "Total Salary : " + salary + ".00TL");
				writerPTE.close();
				break;
			case 'S':
				Security S = new Security();
				salary = S.calculateSalary(week1, week2, week3, week4, yearOfStart);
				BufferedWriter writerS = new BufferedWriter(new FileWriter(registerNumber + ".txt"));
				writerS.write("Name : " + name + "\n" + "Surname : " + surname + "\n" + 
						"Registiration Number : " + registerNumber + "\n" + "Position : " + position + "\n" + 
						"Year of Start : " + yearOfStart + "\n" + "Total Salary : " + salary + ".00TL");
				writerS.close();
				break;
			
			}

		}
	}
}
