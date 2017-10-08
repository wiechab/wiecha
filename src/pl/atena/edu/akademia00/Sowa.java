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

	// te atrybuty b�d� dost�pne tylko wewn�trz tej klasy

	// private static String imie; je�eli dodam s��wko static to mog� si� do tego
	// odwo�a� w klasie zagnie�d�onej
	private String imie;
	private String ksywka;
	private int wiek;
	private int wzrost;

	private final int WIEKPRZEPROWADZKI = 24;

	// konstruktor publiczny
	public Sowa() {
		System.out.println("Jestem Sowa m�dra g�owa!!!");
	}

	// konstruktory mo�na przeci��a�?

	public Sowa(String aaa, int intKomunikat) {

		if (intKomunikat % 2 == 0) {
			System.out.println("Poda�e� mi warto�� parzyst�: " + intKomunikat);
		} else {

			System.out.println("Poda�e� mi warto�� nieparzyst�: " + intKomunikat);
		}
	}

	public Sowa(int wiek) {
		super(); // wywo�uje metody odziedziczone
		this.wiek = wiek;
		System.out.println(
				"Mam  " + this.wiek + " lat, mieszkam w tym lesie od " + (this.wiek - WIEKPRZEPROWADZKI) + " lat!");
	}

	public Sowa(int wiek, int wzrost) {
		this(wiek); // wywo�anie konstruktora w konstruktorze musi by� w pierwszej linii
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
	// metody te� mo�na przeci��a�
	// final blokuje zmian� referencji do obiektu

	public void sprzedaj(final Sowa sowa) {

	}

	public void sprzedaj(Sowa sowa, int ilosc) {

	}

	// metoda zagnie�d�ona
	public static class Dziupla {

		private String drzewo;

		public Dziupla(String drzewo) {
			this.drzewo = drzewo;

			// String imie = Sowa.imie; niedost�pne w klasie zagnie�dzonej
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
