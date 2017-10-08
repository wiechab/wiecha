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
	//ustawiam te wartoœci w bloku statycznym, a nie w metodzie
	static {
		PREZES.setImie("Pszczo³a");
		PREZES.setKsywka("Pszczó³eczka");		
	}
	
	
	//private String nazwa;

}
