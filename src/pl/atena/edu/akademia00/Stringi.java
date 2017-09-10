/**
 * 
 */
package pl.atena.edu.akademia00;

import java.util.Scanner;

/**
 * @author wieslawab
 *
 */
public class Stringi {

	/**
	 * @param args
	 */
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Podaj ci¹g znaków 1:  ");
		String tekst1 = scanner.nextLine();
		
		
		System.out.println("Podaj ci¹g znaków 1::  ");
		String tekst2 = scanner.nextLine();
		
		System.out.println("D³ugoœæ tekstu1: " + tekst1.length() +"; D³ugoœæ tekstu2: " + tekst2.length());
		
		//UWAGA!!! Dla obiektu String NIE STOSUJEMY PORÓWNANIA TYPU ==
		//tekst1 == tekst2 ¯LE
		
		if (tekst1.equals(tekst2) ) {
			System.out.println("Teksty identyczne");
			
			
		}
		else
		{
			System.out.println("Teksty ró¿ne");	
		}
		
			String ciag = String.join(", ", "Jurek","Marek","Wacek");
			System.out.println(ciag);
	}

}
