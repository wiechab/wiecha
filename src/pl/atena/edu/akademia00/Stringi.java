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
		System.out.println("Podaj ci�g znak�w 1:  ");
		String tekst1 = scanner.nextLine();
		
		
		System.out.println("Podaj ci�g znak�w 1::  ");
		String tekst2 = scanner.nextLine();
		
		System.out.println("D�ugo�� tekstu1: " + tekst1.length() +"; D�ugo�� tekstu2: " + tekst2.length());
		
		//UWAGA!!! Dla obiektu String NIE STOSUJEMY POR�WNANIA TYPU ==
		//tekst1 == tekst2 �LE
		
		if (tekst1.equals(tekst2) ) {
			System.out.println("Teksty identyczne");
			
			
		}
		else
		{
			System.out.println("Teksty r�ne");	
		}
		
			String ciag = String.join(", ", "Jurek","Marek","Wacek");
			System.out.println(ciag);
	}

}
