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
		
		System.out.println(Firma.PREZES);
		
		Sowa sowa = new Sowa(); //Moja nowa klasa
		
		/*
		//obiekt Class dziedziczy metody z klasy OBJECTS I ONE S� JU� DOST�PNE W PUSTEJ WYDMUSZCE:
		
		sowa.equals(obj);
		sowa.getClass();
		sowa.hashCode();
		sowa.toString();
		
		itd
		*/
		//Sowa ma wiele konstruktor�w  przeci��a si� je wywo�uj�c z odpowiedni� list� argument�w.
		//Sowa sowa2 = new Sowa("Jestem Sowa m�dra g�owa!!!");
		Sowa sowa3 = new Sowa("Sprawdz liczb�",999);
		
		Sowa sowa4 = new Sowa(109); //podaj� wiek
		
		Sowa sowa6 = Sowa.instance("Zielacha");
		System.out.println("Moja ksywka to " + sowa6);
		
		sowa4.dodajLat(5);
		System.out.println(sowa4);
		

	
		System.out.println("Czy pe�noletni :" + (sowa4.pelnoletni() ? "Tak": "Nie"));
		
		//2017-10-08 wywo�anie klasy zagnie�d�onej w klasie Sowa
		
		Sowa.Dziupla dziupla = new Sowa.Dziupla("sosna");
		System.out.println(dziupla);
		
		//Sowa.BudkaLegowa budka = new Sowa.BudkaLegowa("d�b"); //tutaj nie widzi tej klasy wewn�trznej BudkaLegowa
	}


}
