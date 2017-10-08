/**
 * 
 */
package pl.atena.edu.akademia00;

/**
 * @author wieslawab
 *
 */
public class sprawdzam {

	/**
	 * @param args
	 */
	//final zabezpiecza przed podmian� referencji obiektu
	public static void dodajLat(final Sowa sowa, int lata) {
		int jest = sowa.getWiek();
		jest += lata;
		sowa.setWiek(jest );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sowa sowa = new Sowa();
		sowa.setImie("S�wka Chojn�wka");
		sowa.setWiek(40);
		
		dodajLat(sowa, 3);
		

	}
	
	//Dla typ�w prostych nie dzia�a przekazywanie warto�ci z metody do metody
	public static void dodaj(int wartosc) {
		wartosc ++;
		System.out.println(wartosc);
	}

	public static void przekazWartosc(int wartosc) {
		dodaj(wartosc);
		System.out.println(wartosc); //tutaj nie wy�wietli podbitej warto�ci
		
	}
}
