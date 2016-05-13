import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Driver {
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		//l1.add(12); l1.add(23); l1.add(1); l1.add(2); l1.add(5);
		BufferedReader br = new BufferedReader(new FileReader("integerArray.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			
			l1.add(Integer.parseInt(line));
			
		}
		br.close();
		CountInversions count1 = new CountInversions(l1);
		System.out.println("List to sort: " + l1);
		count1.countTotalInversions(0, l1.size()-1);
		System.out.println("Total of Inversions to sort said list: " + count1.getTotalInversions());
		
	}

}
