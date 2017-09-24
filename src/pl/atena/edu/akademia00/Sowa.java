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
	
	//te atrybuty b�d� dost�pne tylko wewn�trz tej klasy
	
	private String imie;
	private String ksywka;
	private int wiek;
	private int wzrost;
	
	private final int WIEKPRZEPROWADZKI = 24;
	//konstruktor publiczny
	public Sowa() {
		System.out.println("Jestem Sowa m�dra g�owa!!!");
	}

	//konstruktory mo�na przeci��a�?
	


	public Sowa(String aaa, int intKomunikat ) {
		
		if(intKomunikat % 2  == 0) {
			System.out.println("Poda�e� mi warto�� parzyst�: " + intKomunikat );
		} else {
			
		System.out.println("Poda�e� mi warto�� nieparzyst�: " + intKomunikat);
		}
	}

	public Sowa(int wiek) {
		super(); //wywo�uje metody odziedziczone
		this.wiek = wiek;
		System.out.println("Mam  " + this.wiek + " lat, mieszkam w tym lesie od " + (this.wiek - WIEKPRZEPROWADZKI) + " lat!");
	}
	public Sowa(int wiek, int wzrost) {
		this(wiek); //wywo�anie konstruktora w konstruktorze musi by� w pierwszej linii
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
