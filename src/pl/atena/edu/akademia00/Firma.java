/**
 * 
 */
package pl.atena.edu.akademia00;

/**
 * @author wieslawab
 *
 */
public  class Firma {

	/**
	 * @param args
	 */
	public static final Osoba PREZES = new Osoba();
	//ustawiam te warto�ci w bloku statycznym, a nie w metodzie
	static {
		PREZES.setImie("Pszczo�a");
		PREZES.setKsywka("Pszcz�eczka");		
	}
	
	
	//private String nazwa;

}
