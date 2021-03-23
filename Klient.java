package samochody;

import java.util.ArrayList;
import java.util.List;

public class Klient extends Osoba {

	private List<Produkt> produkty = new ArrayList<>();
	private static List<Klient> ekstensja = new ArrayList<>();

	public Klient(String imie, String nazwisko) {
		super(imie, nazwisko);
		ekstensja.add(this);

	}

	public List<Produkt> getProdukty() {
		return produkty;
	}

	public void setProdukty(List<Produkt> produkty) {
		this.produkty = produkty;
	}

	public static List<Klient> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Klient> ekstensja) {
		Klient.ekstensja = ekstensja;
	}

	public void dodajProdukt(Produkt produkt) {
		produkty.add(produkt);

	}

	// ile wydał klient
	public double ileWydalKlient() {
		double suma = 0;
		for (Produkt element : produkty) {
			suma += element.getCena();
		}
		return suma;
	}

	// Znajdz klienta który wydal najwiecej
	public static Klient najdrozszyKlient(List<Klient> klienci) {
		if (klienci == null || klienci.isEmpty()) {
			throw new IllegalArgumentException("Lista nie moze byc pusta");
		}

		Klient max = klienci.get(0);

		for (Klient element : klienci) {
			if (element.ileWydalKlient() > max.ileWydalKlient()) {
				max = element;
			}
		}
		return max;
	}

	// 2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony
	// produkt to ma byc atrybut wyliczalny na podstawie zakupow)
	public Produkt ulubionyProdukt() {
		if (produkty == null || produkty.isEmpty()) {
			throw new IllegalArgumentException("lista jest pusta");
		}
		int licznik = 0;
		int tymczasowyMaks = 0;
		Produkt max = produkty.get(0);
		for (Produkt element : produkty) {
			for (Produkt element2 : produkty) {
				if (element.getNazwa().equals(element2.getNazwa())) {
					licznik++;
				}

				if (licznik > tymczasowyMaks) {
					tymczasowyMaks = licznik;
					max = element;
				}
			}

		}
		return max;
	}

}
