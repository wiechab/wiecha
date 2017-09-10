/**
 * 
 */
package pl.atena.edu.akademia00;

import java.util.Scanner;

/**
 * @author wieslawab
 *
 */
public class PoleOkregu {

	/**
	 * @param args
	 */
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("Podaj wartoœæ promienia r:  ");
		String sr = scanner.nextLine();

		final double PIII = Math.PI;
		int prom = 0;
		try {
			prom = Integer.valueOf(sr);

		} catch (Exception e) {
			System.out.print("To nie jest liczba!!!");
		}

		if (prom != 0) {

			double pole = PIII * Math.pow(prom, 2);
			System.out.println(pole);

		}
	}
}
