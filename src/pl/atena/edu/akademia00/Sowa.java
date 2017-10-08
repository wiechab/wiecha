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

	// te atrybuty bêd¹ dostêpne tylko wewn¹trz tej klasy

	// private static String imie; je¿eli dodam s³ówko static to mogê siê do tego
	// odwo³aæ w klasie zagnie¿d¿onej
	private String imie;
	private String ksywka;
	private int wiek;
	private int wzrost;

	private final int WIEKPRZEPROWADZKI = 24;

	// konstruktor publiczny
	public Sowa() {
		System.out.println("Jestem Sowa m¹dra g³owa!!!");
	}

	// konstruktory mo¿na przeci¹¿aæ?

	public Sowa(String aaa, int intKomunikat) {

		if (intKomunikat % 2 == 0) {
			System.out.println("Poda³eœ mi wartoœæ parzyst¹: " + intKomunikat);
		} else {

			System.out.println("Poda³eœ mi wartoœæ nieparzyst¹: " + intKomunikat);
		}
	}

	public Sowa(int wiek) {
		super(); // wywo³uje metody odziedziczone
		this.wiek = wiek;
		System.out.println(
				"Mam  " + this.wiek + " lat, mieszkam w tym lesie od " + (this.wiek - WIEKPRZEPROWADZKI) + " lat!");
	}

	public Sowa(int wiek, int wzrost) {
		this(wiek); // wywo³anie konstruktora w konstruktorze musi byæ w pierwszej linii
		this.wzrost = wzrost;
	}

	// automatycznie wygenerowany getery i setery
	// podmenu->Source->Generate Getters and Setters ....

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

	public int getWIEKPRZEPROWADZKI() {
		return WIEKPRZEPROWADZKI;
	}

	private Sowa(String ksywka) {
		this.ksywka = ksywka;
		System.out.println(this.ksywka);
	}

	public static Sowa instance(String ksywka) {
		return new Sowa(ksywka);

	}

	/*
	@Override
	public String toString() {
		return String.format("Sowa [imie=%imie, ksywka=%s, wiek=%s, wzrost=%s, WIEKPRZEPROWADZKI=%s]", imie, ksywka, wiek, wzrost,
				WIEKPRZEPROWADZKI);
	}
*/
	@Override
	public String toString() {
		return String.format("Sowa [ ksywka=%s, wiek=%s, wzrost=%s, WIEKPRZEPROWADZKI=%s]",  ksywka, wiek, wzrost,
				WIEKPRZEPROWADZKI);
	}
	public void dodajLat(int lata) {
		this.wiek += lata;
	}

	public boolean pelnoletni() {
		return this.wiek < PELNOLETNIOSC ? false : true;

	}
	// metody te¿ mo¿na przeci¹¿aæ
	// final blokuje zmianê referencji do obiektu

	public void sprzedaj(final Sowa sowa) {

	}

	public void sprzedaj(Sowa sowa, int ilosc) {

	}

	// metoda zagnie¿d¿ona
	public static class Dziupla {

		private String drzewo;

		public Dziupla(String drzewo) {
			this.drzewo = drzewo;

			// String imie = Sowa.imie; niedost¹pne w klasie zagnie¿dzonej
		}

		// @Override
		public String toString() {
			return String.format("Dziupla [drzewo=%s]", drzewo);
		}

	}

	public class BudkaLegowa {

		private String drzewo;

		public BudkaLegowa(String drzewo) {
			this.drzewo = drzewo;

		}

		// @Override
		public String toString() {
			return String.format("BudkaLegowa [drzewo=%s]", drzewo);
		}

	}
}
