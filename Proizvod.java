package Zadaci;

public class Proizvod {
	String opisProizvoda;
	int barKod;
	String zemljaProizvodnje;
	int godinaPrizvodnje;
	double uvoznaCijena;
	public Proizvod(String opisProizvoda, int barKod, String zemljaProizvodnje, int godinaPrizvodnje,
			double uvoznaCijena) {
		super();
		this.opisProizvoda = opisProizvoda;
		this.barKod = barKod;
		this.zemljaProizvodnje = zemljaProizvodnje;
		this.godinaPrizvodnje = godinaPrizvodnje;
		this.uvoznaCijena = uvoznaCijena;
		
		
		
		
	}
	public String getOpisProizvoda() {
		return opisProizvoda;
	}
	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}
	public int getBarKod() {
		return barKod;
	}
	public void setBarKod(int barKod) {
		this.barKod = barKod;
	}
	public String getZemljaProizvodnje() {
		return zemljaProizvodnje;
	}
	public void setZemljaProizvodnje(String zemljaProizvodnje) {
		this.zemljaProizvodnje = zemljaProizvodnje;
	}
	public int getGodinaPrizvodnje() {
		return godinaPrizvodnje;
	}
	public void setGodinaPrizvodnje(int godinaPrizvodnje) {
		this.godinaPrizvodnje = godinaPrizvodnje;
	}
	public double getUvoznaCijena() {
		return uvoznaCijena;
	}
	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	
	public void izrcunajCijenu() {
		this.setUvoznaCijena(getUvoznaCijena());
	}
	@Override
	public String toString() {
		return "Proizvod [opisProizvoda=" + opisProizvoda + ", barKod=" + barKod + ", zemljaProizvodnje="
				+ zemljaProizvodnje + ", godinaPrizvodnje=" + godinaPrizvodnje + ", uvoznaCijena=" + uvoznaCijena
				+ ", getOpisProizvoda()=" + getOpisProizvoda() + ", getBarKod()=" + getBarKod()
				+ ", getZemljaProizvodnje()=" + getZemljaProizvodnje() + ", getGodinaPrizvodnje()="
				+ getGodinaPrizvodnje() + ", getUvoznaCijena()=" + getUvoznaCijena() + "]";
	}
	
	


}
