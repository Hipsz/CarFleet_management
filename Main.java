package samochody;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Stwórz klasę Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko, ulubiony produkt). Klient kupuje produkty (nazwa, cena).
//Pracownik uzywa samochod (model, marka)
//
//1) Znajdz klienta który wydal najwiecej
//
//2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony produkt to ma byc atrybut wyliczalny na podstawie zakupow)
//
//3) Wyswietl 3 top pracownikow z najwieksza pensja
//
//4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta

		Klient k1 = new Klient("Waldemar", "Debski");
		Klient k2 = new Klient("Andrzej", "Nowak");
		Klient k3 = new Klient("Andrzej", "Nowakowski");
		Produkt p1 = new Produkt("Mleko", 40);
		Produkt p2 = new Produkt("Płatki", 20);
		Produkt p3 = new Produkt("Telefon", 200);
		k1.dodajProdukt(p1);
		k1.dodajProdukt(p1);
		k2.dodajProdukt(p2);
		k2.dodajProdukt(p3);
		System.out.println(Klient.najdrozszyKlient(Klient.getEkstensja()));
		
		System.out.println(k1.ileWydalKlient());
		Pracownik pr1 = new Pracownik("Andrzej", "Duda", "Woloska", 3000);
		Pracownik pr2 = new Pracownik("Wieslaw", "Nowakwoski", "Dluga", 5000);
		Samochod s1 = new Samochod("Audi", "A6");
		Samochod s2 = new Samochod("BMW", "5");
		Samochod s3 = new Samochod("Volvo", "V90");
		//PracownikSamochod p_s1 = new PracownikSamochod(LocalDate.of(year, month, dayOfMonth), "14.03.2021", pr1, s1);
		
	}
}
