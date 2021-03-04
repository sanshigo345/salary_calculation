import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Personnel personnelObject = new Personnel();
		personnelObject.createOutput(args[0], args[1]);
		
	}
}
