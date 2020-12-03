import java.util.*;
import java.io.*;

public class Aufgabe2 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(new File("numbers.txt"));


		filterEvens(numbers);
		System.out.println(numbers);

	}

	// Removes all elements w/ even values from the list.
	public static void filterEvens(ArrayList<Integer> list) {
		
	}

}
