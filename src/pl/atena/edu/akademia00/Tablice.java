/**
 * 
 */
package pl.atena.edu.akademia00;

/**
 * @author wieslawab
 *
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Tablice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tablica;
		int[] tablica2 = new int[10]; // kolekcja zawiera indeksy od 0..9 o warto�ciach 0

		Long[] liczby = new Long[10]; // zawiera 10 element�w Null

		for (int i = 0; i < 10; i++) {
			System.out.println("Na indeksie " + i + " warto�� " + tablica2[i]);
		}

		for (int i = 0; i < tablica2.length; i++) {
			System.out.println("Na indeksie " + i + " warto�� " + tablica2[i]);
		}

		/*
		 * CharSequence[] tablica3 = new CharSequence[10];
		 * 
		 * String ala = ""; ala.join(";", tablica3);
		 */

		float[] test = new float[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Na indeksie " + i + " warto�� " + test[i]);
		}

		// TA P�TLA JEST bardziej uniwersalna ni� poprzednia, nie musimy dba� o ilo�� indeks�w

		for (float item : test) {
			System.out.println("warto�� " + item);
		}

		// Warto�ci malej�ce
		System.out.println();
		System.out.println("Warto�ci malej�ce zastosowanie increment i decrement a jednej p�tli");

		int[] tab_01 = new int[10];
		int j = 9;
		for (int i = 0; i < tab_01.length; i++, j--) {

			tab_01[i] = j;
		}
		System.out.println((Arrays.toString(tab_01)));

	}

}
