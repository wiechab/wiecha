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
		
		System.out.println("Sortowanie");
		int[] tabb = {1,6,0,9} ;
		Arrays.sort(tabb);
		System.out.println(Arrays.toString(tabb));
		
		//wype�niam tablic� warto�ci�
		System.out.println("wype�niam tablic� warto�ci� 99");
		Arrays.fill(tabb, 99);
		
		System.out.println(Arrays.toString(tabb));
		
		Integer [][] tabTab = {{1,2,3,4}, {1,2,3,4},{1,2,3,4}};
		System.out.println("Wy�wietlam zawarto�� tabTab");
		for (Integer[] kolumna :tabTab) {
			for (Integer element :kolumna) {
				System.out.print(element + "" );
			}
			System.out.print("\n");
		}
		
		Integer [][] tab10 = new Integer [10][10];
		
		//Zad. 14 Tablica z tablicami o r�nych wymiarach
		

		int [][] tab2 = {{1},{1,2,3},{2,2},{3,3,3,5}} ;
	

		
		System.out.println("Wy�wietlam zawarto�� tab2");
		for (int[] kolumna :tab2) {
			for (int element :kolumna) {
				System.out.print(element + "" );
			}
			System.out.print("\n");
		}
		
		//Zad.15 wype�nij tabele 10x10 tak aby otrzyma� 1 po przek�tnej
		/*
		 * Wy�wietlam zawarto�� tab10_10
			1000000001
			0100000010
			0010000100
			0001001000
			0000110000
			0000110000
			0001001000
			0010000100
			0100000010
			1000000001
			*/
			
		int  [][] tab10_10 = new int [10][10];
		//Arrays.fill(tab10_10, ???  ); //w przypadku wielowymiarowych tabel fill si� nie nadaje
	
		for(int i = 0; i < 10; i++) {
			for (int ii = 0; ii < 10; ii++ ) {
				if(i == ii) {
					tab10_10[i][ii] = 1;
				} else if(ii +i == 9) {
					tab10_10[i][ii] = 1;
				}
			}
		}
		//albo
		for(int i = 0; i < 10; i++) {
			for (int ii = 0; ii < 10; ii++ ) {
				if(i == ii || ii +i == 9) {
					tab10_10[i][ii] = 1;
				} 
			}
		}
		System.out.println("Wy�wietlam zawarto�� tab10_10");
		for (int[] kolumna :tab10_10) {
			for (int element :kolumna) {
				System.out.print(element + "" );
			}
			System.out.print("\n");
		}
		
	}

}
