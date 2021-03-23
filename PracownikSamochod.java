package samochody;

import java.time.LocalDate;

public class PracownikSamochod {

	private LocalDate dataWypozyczenia, dataOddania;
	private Pracownik pracownik;
	private Samochod samochod;
	public PracownikSamochod(LocalDate dataWypozyczenia, LocalDate dataOddania, Pracownik pracownik,
			Samochod samochod) {
		
		this.dataWypozyczenia = dataWypozyczenia;
		this.dataOddania = dataOddania;
		this.pracownik = pracownik;
		pracownik.dodajPracownikSamochod(this);
		this.samochod = samochod;
		samochod.dodajPracownikSamochod(this);
	}
	public LocalDate getDataWypozyczenia() {
		return dataWypozyczenia;
	}
	public void setDataWypozyczenia(LocalDate dataWypozyczenia) {
		this.dataWypozyczenia = dataWypozyczenia;
	}
	public LocalDate getDataOddania() {
		return dataOddania;
	}
	public void setDataOddania(LocalDate dataOddania) {
		this.dataOddania = dataOddania;
	}
	public Pracownik getPracownik() {
		return pracownik;
	}
	public void setPracownik(Pracownik pracownik) {
		this.pracownik = pracownik;
	}
	public Samochod getSamochod() {
		return samochod;
	}
	public void setSamochod(Samochod samochod) {
		this.samochod = samochod;
	}
	
}
