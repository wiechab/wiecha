/**
 * 
 */
package pl.atena.edu.akademia00;

/**
 * @author wieslawab
 * @since 2017-10-08
 * @version 0.02
 * @return {@link Osoba}
 */
public class Osoba {

	public static final int PELNOLETNIOSC = 18;


	private String imie;
	private String ksywka;
	private int wiek;
	private int wzrost;
	
	/*
	public static void main(String[] args) {
		
		
	}
	*/
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getKsywka() {
		return ksywka;
	}

	public void setKsywka(String ksywka) {
		this.ksywka = ksywka;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public int getWzrost() {
		return wzrost;
	}

	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}

	public static int getPelnoletniosc() {
		return PELNOLETNIOSC;
	}
	
	public boolean pelnoletni() {
		return this.wiek < PELNOLETNIOSC ? false : true;

	}
	@Override
	public String toString() {
		return String.format("Osoba  [imie=%s, ksywka=%s]", imie, ksywka);
	}


}
