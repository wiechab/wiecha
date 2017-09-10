/**
 * 
 */
package pl.atena.edu.akademia00;

import java.util.Scanner;

/**
 * @author wieslawab
 *
 */
public class Pole{

	/**
	 * @param args
	 */

	private static Scanner scanner = new Scanner(System.in);
	public static final int MIN = 1;
	public static final int MAX = 10;

	/**
	 * @param liczba
	 * @param komunikat
	 * @return
	 */
	public static boolean sprawdz(int liczba, String komunikat) {
		if (!(liczba >= MIN && liczba <= MAX)) {
			System.out.println(komunikat);
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Podaj wartoœæ boku a:  ");
		String sa = scanner.nextLine();

		System.out.println("Podaj wartoœæ boku b:  ");
		String sb = scanner.nextLine();

		int ia = Integer.valueOf(sa);
		int ib = Integer.valueOf(sb);

		boolean testA = sprawdz(ia, "Liczba a poza zakresem od " + MIN + " do " + MAX);
		boolean testB = sprawdz(ib, "Liczba b poza zakresem od " + MIN + " do " + MAX);

		if (!testA || !testB) {
			return;
		}

		System.out.println("Pole prostok¹ta = " + (ia * ib));

		if (ia > ib) {
			System.out.println("Bok a szerszy od b pole: " + (ia * ib));
		} else if (ia == ib) {
			System.out.println("To jest kwadrat o polu: " + (ia * ib));
		}

		/*
		 * 
		 * int bokA = 10; int bokB = 2;
		 * 
		 * int pole = Math.multiplyExact(bokA,bokB); System.out.println(pole);
		 * 
		 * 
		 * bokA = 10; bokB = 2; System.out.println(bokA * bokB);
		 */
	}

}
