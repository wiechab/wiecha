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
	
	public static final int MIN = 1;
	public static final int MAX = 12;
	
	public static String podajMiesiac(int liczba) {
		String miesiac = null;
		
		if (!(liczba >= MIN && liczba <= MAX)) {
			System.out.println("Poda³eœ b³êdny miesi¹c !!!");
			
			
			return "B£¥D";
		}
		
		
		switch (liczba) {
		case 1:
			miesiac = "styczeñ";
			break;
		case 2:
			miesiac = "luty";
			break;
		case 3:
			miesiac = "marzec";
			break;
		case 4:
			miesiac = "kwiecieñ";
			break;
		case 5:
			miesiac = "maj";
			break;
		case 6:
			miesiac = "czerwiec";
			break;
		case 7:
			miesiac = "lipiec";
			break;
		case 8:
			miesiac = "sierpieñ";
			break;
			
		case 9:
			miesiac = "wrzesieñ";
			break;
			
		case 10:
			miesiac = "pa¿dziernik";
			break;
			
		case 11:
			miesiac = "listopad";
			break;
			
		case 12:
			miesiac = "grudzieñ";
			
			break;
			default:
				break;
		
		}
	
		return miesiac;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Podaj ci¹g znaków 1:  ");
		String tekst1 = scanner.nextLine();

		System.out.println("Podaj ci¹g znaków 2:  ");
		String tekst2 = scanner.nextLine();
		
		System.out.println("Podaj miesi¹c:  ");
		String tekst3 = scanner.nextLine();
		
		int mc = Integer.valueOf(tekst3);
		
		String nazwaMc = podajMiesiac(mc);
		
		if(! (nazwaMc.equals("B£¥D"))) {
			System.out.println("Poda³eœ miesi¹c : " + nazwaMc);
		}


		System.out.println("D³ugoœæ tekstu1: " + tekst1.length() + "; D³ugoœæ tekstu2: " + tekst2.length());

		// UWAGA!!! Dla clasy String NIE STOSUJEMY PORÓWNANIA TYPU ==
		// tekst1 == tekst2 ¯LE dobrze jest tak tekst1.equals(tekst2)

		if (tekst1.equals(tekst2)) {
			System.out.println("Teksty s¹ identyczne");

		} else {
			System.out.println("Teksty s¹ ró¿ne");
		}

		String ciag = String.join(", ", "Jurek", "Marek", "Wacek");
		System.out.println(ciag);
		
		String[] tablica = ciag.split(",");
		
		for (int i = 0 ; i < tablica.length ; i++) {
			
			tablica[i] = (tablica[i].trim());
			System.out.println(tablica[i]);
		}
		

	}

}
