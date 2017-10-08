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
	//final zabezpiecza przed podmian¹ referencji obiektu
	public static void dodajLat(final Sowa sowa, int lata) {
		int jest = sowa.getWiek();
		jest += lata;
		sowa.setWiek(jest );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sowa sowa = new Sowa();
		sowa.setImie("Sówka Chojnówka");
		sowa.setWiek(40);
		
		dodajLat(sowa, 3);
		

	}
	
	//Dla typów prostych nie dzia³a przekazywanie wartoœci z metody do metody
	public static void dodaj(int wartosc) {
		wartosc ++;
		System.out.println(wartosc);
	}

	public static void przekazWartosc(int wartosc) {
		dodaj(wartosc);
		System.out.println(wartosc); //tutaj nie wyœwietli podbitej wartoœci
		
	}
}
