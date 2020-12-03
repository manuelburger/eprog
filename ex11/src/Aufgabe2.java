import java.util.*;
import java.io.*;

public class Aufgabe2 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(new File("numbers.txt"));
		while (input.hasNext()) {
			int n = input.nextInt();
			numbers.add(n);
		}
		input.close();

		System.out.println(numbers);

		int tmp = 0;
		for (int i = numbers.size() - 1; i >= 0; i--) {
			tmp += numbers.get(i);
		}
		System.out.println("Durchschnitt [int] = " + tmp / numbers.size());
		System.out.println("Durchschnitt [double] = " + (double) tmp / numbers.size());

		int min = numbers.get(0);
		int max = min;
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}
			if (numbers.get(i) < min) {
				min = numbers.get(i);
			}
		}
		System.out.println("Min = " + min + " Max = " + max);

		filterEvens(numbers);
		System.out.println(numbers);

	}

	// Removes all elements w/ even values from the list.
	public static void filterEvens(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			int n = list.get(i);
			if (n % 2 == 0) {
				list.remove(i);
			}
		}
	}

}
