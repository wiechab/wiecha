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

		// precyzja on tutaj przek³amuje dane 
		
		for (double i = 0; i < 1; i += 0.1) {
			System.out.println(i);
		}

		char znak = '\u004a';
		System.out.println(znak);
		
		char ch1 ='\n';
		char ch2 = '\r';
		System.out.println(ch1+ch2);
		
		char znaki[] = "Witaj Œwiecie".toCharArray();
		
		for (byte i = 0 ; i < znaki.length;i++) {
			
			System.out.println(znaki[i] );
		}
		
		final double AAA_CONST = 1.9; //STA£A - standardowo stosujemy nazwy z wielkich liter dla porz¹dku
		
		
		
	}

}
