/**
 * 
 */
package pl.atena.edu.akademia00;

/**
 * @author wieslawab
 *
 */
public class OdpalenieSowy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sowa sowa = new Sowa(); //Moja nowa klasa
		
		/*
		//obiekt Class dziedziczy metody z klasy OBJECTS I ONE S¥ JU¯ DOSTÊPNE W PUSTEJ WYDMUSZCE:
		
		sowa.equals(obj);
		sowa.getClass();
		sowa.hashCode();
		sowa.toString();
		
		itd
		*/
		
		//Sowa sowa2 = new Sowa("Jestem Sowa m¹dra g³owa!!!");
		Sowa sowa3 = new Sowa("Sprawdz liczbê",999);
		
		Sowa sowa4 = new Sowa(109); //podajê wiek
		
		Sowa sowa6 = Sowa.instance("Zielacha");
		System.out.println("Moja ksywka to " + sowa6);
		
		sowa4.dodajLat(5);
		System.out.println(sowa4);
	
		System.out.println("Czy pe³noletni :" + (sowa4.pelnoletni() ? "Tak": "Nie"));
	}

}
