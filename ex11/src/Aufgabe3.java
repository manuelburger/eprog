import java.util.*;
import java.io.*;

public class Aufgabe3 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		Scanner input = new Scanner(new File("list1.txt"));
		while (input.hasNext()) {
			int i = input.nextInt();
			list1.add(i);
		}
		input.close();

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		input = new Scanner(new File("list2.txt"));
		while (input.hasNext()) {
			int i = input.nextInt();
			list2.add(i);
		}

		System.out.println(list1);
		System.out.println(list2);

		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list1);
		System.out.println(list3);
		list3.retainAll(list2);
		System.out.println(list3);
	}
}
