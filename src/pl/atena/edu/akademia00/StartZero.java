/**
 * 
 */
package pl.atena.edu.akademia00;

import java.util.Random;

/*Ctrl+Shift+O
							
							/**
							* @author wieslawab
							*
							*/

public class StartZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long mille = 1_000_000L;
		byte six = 6;
		int minus = -90;

		double doub = 100000.000000000666;
		float fl = 125.6666F;

		System.out.println("Start One");
		System.out.println((new Random().nextInt()));

		System.out.println("Cuzamen do kupy:" + (mille + six + minus));

		System.out.println(doub + fl);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		// precyzja on tutaj przek�amuje dane 
		
		for (double i = 0; i < 1; i += 0.1) {
			System.out.println(i);
		}

		char znak = '\u004a';
		System.out.println(znak);
		
		char ch1 ='\n';
		char ch2 = '\r';
		System.out.println(ch1+ch2);
		
		char znaki[] = "Witaj �wiecie".toCharArray();
		
		for (byte i = 0 ; i < znaki.length;i++) {
			
			System.out.println(znaki[i] );
		}
		
		final double AAA_CONST = 1.9; //STA�A - standardowo stosujemy nazwy z wielkich liter dla porz�dku
		
		System.out.println(Zwierzaki.KOT);
		
		//reszta z dzielenia
		System.out.println(500%3);
		
		int liczba = 100;
		liczba -=10;
		liczba +=90;
		liczba ++;
		liczba --;
		
		
		//tablicca string�w, indeksuje si� od 0
		
		String[] table = {"jeden","dwa","trzy" };
		int indeks = 0;
		System.out.println(table[indeks]); //zwraca  "jeden"
		System.out.println(table[indeks++]);//zwraca te� "jeden" bo incrementacja odbywa si� ju� po wy�wietleniu informacji
		System.out.println(table[indeks]); // zwraca "dwa"
		
		System.out.println(table[++indeks]); //zwraca "trzy", incrementacja przed  wy�wietleniu informacji
		
		
	//dzia�ania matematyczne - klasa Math
		
		int test = 1000000000 * 3; //uwaga ta sk��dnia nie chroni nas przed b��dem przepe�nienia warto�ci;  
		//zwraca warto�� z kapelusza -1294967296
		System.out.println(test);
		
		//int test_2 = Math.multiplyExact(1000000000, 3); //zwraca exeption - czyli chroni nas przed b��dami
		
		//konwersje typ�w
		
		int ii = 55;
		double dd = 2.55 * ii ;
		
		char cc = 'J' + 1; //zwraca K  to jest prawid�owe dzia�anie
		System.out.println(cc) ;
		
		int ii2 = 'J' + 1;
		
		System.out.println(ii2) ;
		
		
		
		
		
	}
		

}
