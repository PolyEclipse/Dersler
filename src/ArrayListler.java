import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListler {

	public static void main(String[] args) {

		ArrayList<String> diller = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		scanner.close();
		diller.add(a);
		diller.add("T�rk�e");
		diller.add("Fars�a");
		diller.add("Almanca");
		diller.add("�ngilizce");
		for (int i = 0; i < 5; i++) {
			System.out.println(diller.get(i));
		}
		for (String il : diller) {
			System.out.println(il);
		}

	}

}
