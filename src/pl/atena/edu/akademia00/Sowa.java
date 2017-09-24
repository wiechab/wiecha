/**
 * 
 */
package pl.atena.edu.akademia00;

import java.math.BigInteger;

/**
 * @author wieslawab
 *
 */
public class Sowa {
	public static final int PELNOLETNIOSC = 18;
	
	//te atrybuty bêd¹ dostêpne tylko wewn¹trz tej klasy
	
	private String imie;
	private String ksywka;
	private int wiek;
	private int wzrost;
	
	private final int WIEKPRZEPROWADZKI = 24;
	//konstruktor publiczny
	public Sowa() {
		System.out.println("Jestem Sowa m¹dra g³owa!!!");
	}

	//konstruktory mo¿na przeci¹¿aæ?
	


	public Sowa(String aaa, int intKomunikat ) {
		
		if(intKomunikat % 2  == 0) {
			System.out.println("Poda³eœ mi wartoœæ parzyst¹: " + intKomunikat );
		} else {
			
		System.out.println("Poda³eœ mi wartoœæ nieparzyst¹: " + intKomunikat);
		}
	}

	public Sowa(int wiek) {
		super(); //wywo³uje metody odziedziczone
		this.wiek = wiek;
		System.out.println("Mam  " + this.wiek + " lat, mieszkam w tym lesie od " + (this.wiek - WIEKPRZEPROWADZKI) + " lat!");
	}
	public Sowa(int wiek, int wzrost) {
		this(wiek); //wywo³anie konstruktora w konstruktorze musi byæ w pierwszej linii
		this.wzrost = wzrost;
	}
	
	private Sowa(String ksywka) {
		this.ksywka = ksywka;
		System.out.println(this.ksywka);
	}
	
	public static Sowa instance( String ksywka) {
		return new Sowa(ksywka);
		
	}

	//@Override
	public String toString() {
		return String.format("Sowa [imie=%s, ksywka= %s, wiek= %s, wzrost= %s, WIEKPRZEPROWADZKI= %s ]",imie, ksywka, wiek, wzrost, WIEKPRZEPROWADZKI);
	}
	
    public void dodajLat(int lata) {
    	this.wiek += lata;
    }
    public boolean  pelnoletni () {
    	return this.wiek < PELNOLETNIOSC ? false: true;
    	
    }
}
