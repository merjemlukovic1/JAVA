package Zadaci;

public class HemijskiProizvodi extends Proizvod {
	private double temperaturaSkladistenja;
	private boolean zapaljivo;

	public HemijskiProizvodi(String opisProizvoda, int barKod, String zemljaProizvodnje, int godinaPrizvodnje,
			double uvoznaCijena, double temperaturaSkladistenja, boolean zapaljivo) {
		super(opisProizvoda, barKod, zemljaProizvodnje, godinaPrizvodnje, uvoznaCijena);
		this.temperaturaSkladistenja = temperaturaSkladistenja;
		this.zapaljivo = zapaljivo;
	}

	public double getTemperaturaSkladistenja() {
		return temperaturaSkladistenja;
	}

	public void setTemperaturaSkladistenja(double temperaturaSkladistenja) {
		this.temperaturaSkladistenja = temperaturaSkladistenja;
	}

	public boolean isZapaljivo() {
		return zapaljivo;
	}

	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}

	
	
	public void izracunajCijenu() {

		if (zapaljivo) {
			this.setUvoznaCijena(getUvoznaCijena()*1.125);
		}else {
			this.setUvoznaCijena(getUvoznaCijena()*1.10);
		}
	}

	@Override
	public String toString() {
		return "HemijskiProizvodi [temperaturaSkladistenja=" + temperaturaSkladistenja + ", zapaljivo=" + zapaljivo
				+ ", opisProizvoda=" + opisProizvoda + ", barKod=" + barKod + ", zemljaProizvodnje=" + zemljaProizvodnje
				+ ", godinaPrizvodnje=" + godinaPrizvodnje + ", uvoznaCijena=" + uvoznaCijena
				+ ", getTemperaturaSkladistenja()=" + getTemperaturaSkladistenja() + ", isZapaljivo()=" + isZapaljivo()
				+ "]";
	}




}
