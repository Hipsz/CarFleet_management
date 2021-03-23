package samochody;

import java.util.ArrayList;
import java.util.List;

public class Pracownik extends Osoba {
	private static List<Pracownik> ekstensja = new ArrayList<>();
	private List<PracownikSamochod> listaPracownikSamochod = new ArrayList<>();

	private String adres;
	private double pensja;

	public Pracownik(String imie, String nazwisko, String adres, double pensja) {
		super(imie, nazwisko);
		this.adres = adres;
		this.pensja = pensja;
		ekstensja.add(this);
	}

	public static List<Pracownik> getEkstensja() {
		return ekstensja;
	}

	public void dodajPracownikSamochod(PracownikSamochod element) {
		listaPracownikSamochod.add(element);
	}

	public void wyswietlPracownikSamochod() {
		for (PracownikSamochod element : listaPracownikSamochod) {
			System.out.print(element.getSamochod() + " ");
		}
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}

	// 3) Wyswietl 3 top pracownikow z najwieksza pensja (poczytac o comperator)
	public static List<Pracownik> najwiecejZarabiajacy(List<Pracownik> pracownicy) {
		List<Pracownik> zwrotna = new ArrayList<>();
		for (Pracownik element : pracownicy) {

		}
		return zwrotna;
	}
	// 4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje
	// (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta

}
