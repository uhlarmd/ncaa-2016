import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		ArrayList<String> teamNames = new ArrayList<>();
		ArrayList<Double> expected = new ArrayList<>();
		ArrayList<String> Region = new ArrayList<>();
		ArrayList<Integer> seed = new ArrayList<>();
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the file name with extention : ");
			File file = new File(input.nextLine());
			
			input = new Scanner(file);
			
			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
