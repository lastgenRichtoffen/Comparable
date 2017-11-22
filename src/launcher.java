import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class launcher {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner (new File("names.txt"));
		ArrayList<person> list = new ArrayList<person>();
		while(sc.hasNextLine()){
			person p = new person(sc.nextLine().trim());
			list.add(p);
			
			System.out.println(list);
		}
	}
	
}
