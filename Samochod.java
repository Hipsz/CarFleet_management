package samochody;

import java.util.ArrayList;
import java.util.List;

public class Samochod {

	private String model, marka;
	private List <PracownikSamochod> listaPracownikSamochod = new ArrayList<>();

	public Samochod(String model, String marka) {
		
		this.model = model;
		this.marka = marka;
	}
	public void dodajPracownikSamochod (PracownikSamochod element) {
		listaPracownikSamochod.add(element);
	}
	public void wyswietlPracownikSamochod() {
		for (PracownikSamochod element : listaPracownikSamochod) {
			System.out.print(element.getPracownik() + " ");
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
	
}
