/**
 * 
 */
package pl.atena.edu.akademia00;

import java.util.Random;
/**
 * @author wieslawab
 *
 */
import java.util.Scanner;

public class Wejscie {

	/**
	 * @param args
	 */

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Witajcie! \n Tera My !!!";
		/*
		 * boolean czyJest = scanner.hasNext();
		 * System.out.println("Czy jest jakaœ linia do wpisania?" + scanner.hasNext());
		 * if (czyJest) { System.out.println("Wczytujê " + scanner.nextLine()); }
		 * czyJest = scanner.hasNext();
		 * System.out.println("Czy jest jakaœ linia do wpisania?" + scanner.hasNext());
		 * if (czyJest) { System.out.println("Wczytujê " + scanner.nextLine()); }
		 * 
		 * czyJest = scanner.hasNext();
		 * System.out.println("Czy jest jakaœ linia do wpisania?" + scanner.hasNext());
		 * if (czyJest) { System.out.println("Wczytujê " + scanner.nextLine()); }
		 */

		/*
		 * Ró¿ne style formatowania
		 * 
		 * System.out.println(1000.0/3.0); System.out.println();
		 * System.out.printf("%8.2f",1000.0/3.0); System.out.println();
		 * System.out.printf("%.2f",1000.0/3.0); System.out.println();
		 * System.out.printf("%,+.4f",1000.0/3.0); System.out.println();
		 * 
		 * String message = String.format("Witaj %s. Za rok bêdziesz mia³ %d lat.\n",
		 * "Henio",40) ; System.out.println(message); System.out.println(); final double
		 * PIII = Math.PI;
		 * 
		 * System.out.printf("%8.5f", Math.PI); //zaokr¹gla Pi do 5 miejsc po przecinku
		 * System.out.println(); System.out.printf("%8.9f",PIII); //zaokr¹gla Pi do 9
		 * miejsc po przecinku
		 * 
		 */
		/*
		 * Integer warunek = Integer.valueOf(100); Integer sum = Integer.valueOf(0);
		 * 
		 * int iteracje = 0;
		 * 
		 * Random generator = new Random();
		 * 
		 * while (sum.compareTo(warunek) < 0) { sum += generator.nextInt(19); //wybiera
		 * losowo liczbê z zakresy 0 .. 19 iteracje ++ ; }
		 * 
		 * System.out.println("Po iteracji " + iteracje +
		 * " skoñczy³ dzia³anie z wynikiem " + sum);
		 * System.out.printf("Po  %d iteracjach skoñczy³ dzia³anie z wynikiem %d",
		 * iteracje, sum);
		 * 
		 */
		/*
		 * //
		 * 
		 * oblicz sumê licz parzystych z przedzia³u od 0 .. 100 opcja 1
		 * 
		 * Pêtla WHILE bada warunek przed WEJŒCIEM, mo¿e siê niGDY NIE WYKONAÆ
		 * 
		 * float test = * 0; Integer iiteracje = Integer.valueOf(0); Integer sum =
		 * Integer.valueOf(0);
		 * 
		 * while (iiteracje.compareTo(100) < 0) { iiteracje++;
		 * 
		 * test = iiteracje % 2; if (test == 0) { sum += iiteracje;
		 * 
		 * }
		 * 
		 * } System.out.printf("Po  %d iteracjach skoñczy³ dzia³anie z wynikiem %d",
		 * iiteracje, sum);
		 */
		// oblicz sumê licz parzystych z przedzia³u od 0 .. 100
		/*
		 * Integer iiteracje = Integer.valueOf(0); Integer sum = Integer.valueOf(0);
		 * 
		 * while (iiteracje.compareTo(100) < 0) { iiteracje++; if (iiteracje % 2 == 0) {
		 * sum += iiteracje; } }
		 * System.out.printf("Po  %d iteracjach skoñczy³ dzia³anie z wynikiem %d",
		 * iiteracje, sum);
		 * 
		 * sum = 0;
		 * 
		 * do { iiteracje++; if (iiteracje % 2 == 0) { sum += iiteracje; }
		 * 
		 * } while (sum != 100);
		 */
		// Wybierz najmniejsz¹ i najwiêksz¹ liczbê ze zbioru n=5 wylosowanych z zakresu
		// 0..99
		Random generator = new Random();
		/*
		 * int iteracje = 0, liczba = 0; int liczbaMax = 0, liczbaMin = 100; float sum =
		 * 0;
		 * 
		 * do { liczba = generator.nextInt(100); //generatot bierze w tym przypadku od 0
		 * .. 99 System.out.printf("liczba %d " ,liczba); System.out.println();
		 * 
		 * if(liczba > liczbaMax) { liczbaMax = liczba; }
		 * 
		 * if( liczba < liczbaMin) { liczbaMin = liczba; } sum += liczba; iteracje ++;
		 * 
		 * } while (iteracje < 5);
		 * 
		 * float liczbaSrednia = sum/iteracje;
		 * 
		 * System.out.printf("Po  %d iteracjach Min %d, Max %d", iteracje,
		 * liczbaMin,liczbaMax ); System.out.println();
		 * System.out.printf("%.4f",liczbaSrednia); System.out.println();
		 * //System.out.println(liczbaSrednia); //System.out.println();
		 * //System.out.printf("\"%,+.4f\"",liczbaSrednia);
		 * //System.out.printf("Srednia z w/w %d","%.2f", liczbaSrednia);
		 * 
		 */
		// ===============Pêtla FOR

		/*
		 * for (int i = 1; i<= 10; i++) { System.out.println(i); }
		 * 
		 * char test = 'A' ; for (int i = 1; i<= 26; i++) { System.out.println(test +
		 * ", ");
		 * 
		 * test ++; }
		 */
		// TABLICZKA MNO¯ENIA wyniki w zakresie od 0 .. 100
		// int liczba = 0;
		// String liczby = "" ;

		System.out.println("TABLICZKA MNO¯ENIA wyniki w zakresie od 0 .. 100");
		
		for (int i = 0; i < 11; i++) {
			// liczby = "" ;
			for (int ii = 0; ii < 11; ii++) {
				// liczba = i * ii;
				// liczby = liczby + liczba + ", " ;

				if (i == 0) {
					System.out.printf("%4d", ii);
				} else if (ii == 0) {
					System.out.printf("%4d", i);
				} else {

					System.out.printf("%4d", i * ii); // ten format dodaje spacje z lewej do 4 znaków razem
				}
			}
			System.out.println();
		}
		
		//Sumowanie wartoœci parzystych z przedzia³u od 0..10
		
		int sum = 0;
		System.out.println("Sumowanie wartoœci parzystych z przedzia³u od 0..10");
		for (int i = 0; i < 11; i++) {
			if (i %2 !=0) {
				continue; //pomija krok idzie na pocz¹tek pêtli; break powoduje wyjœcie z pêtli, przerywa dzia³anie
			}
			sum += i;
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Suma=" +sum);
	}
}
