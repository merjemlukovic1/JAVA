package Zadaci;

public class Garderoba extends Proizvod {
	String materijalProizvodnje;
	String sezona;
	public Garderoba(String opisProizvoda, int barKod, String zemljaProizvodnje, int godinaPrizvodnje,
			double uvoznaCijena, String materijalProizvodnje, String sezona) {
		super(opisProizvoda, barKod, zemljaProizvodnje, godinaPrizvodnje, uvoznaCijena);
		this.materijalProizvodnje = materijalProizvodnje;
		this.sezona = sezona;
	}
	public String getMaterijalProizvodnje() {
		return materijalProizvodnje;
	}
	public void setMaterijalProizvodnje(String materijalProizvodnje) {
		this.materijalProizvodnje = materijalProizvodnje;
	}
	public String getSezona() {
		return sezona;
	}
	public void setSezona(String sezona) {
		this.sezona = sezona;
	}

	public void izracunajCijenu() {
		this.setUvoznaCijena(getUvoznaCijena()*1.05); //ovo ako zelimo da pristupimo privatni metod a ne mozemo da mu pristupimoo
		//this.uvoznaCijena = this.getUvoznaCijena
		
	}
	@Override
	public String toString() {
		return "Garderoba [materijalProizvodnje=" + materijalProizvodnje + ", sezona=" + sezona + ", opisProizvoda="
				+ opisProizvoda + ", barKod=" + barKod + ", zemljaProizvodnje=" + zemljaProizvodnje
				+ ", godinaPrizvodnje=" + godinaPrizvodnje + ", uvoznaCijena=" + uvoznaCijena
				+ ", getMaterijalProizvodnje()=" + getMaterijalProizvodnje() + ", getSezona()=" + getSezona() + "]";
	}

}
