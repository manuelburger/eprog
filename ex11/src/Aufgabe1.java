import java.util.*;
import java.io.*;

public class Aufgabe1 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> allWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("aufgabentext1.txt"));
		while (input.hasNext()) {
			String word = input.next();
			System.out.println(".." + word);
			allWords.add(word);
		}
		input.close();

		System.out.println(allWords);

		for (int i = allWords.size() - 1; i >= 0; i--) {
			System.out.println(allWords.get(i));
		}

		for (int i = 0; i < allWords.size(); i++) {
			String s = allWords.get(i);
			if (Character.isUpperCase(s.charAt(0)))
				System.out.println(s.toUpperCase());
		}

		for (int i = 0; i < allWords.size(); i++) {
			String s = allWords.get(i);
			if (Character.isUpperCase(s.charAt(0))) {
				allWords.remove(i);
				i--;
			}
		}

		System.out.println(allWords);

	}

	//

}
