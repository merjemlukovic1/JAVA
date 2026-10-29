package Zadaci;
import java.time.LocalDate;

public class Hrana extends Proizvod {
	private int brojKalorija;
	private LocalDate datumRokaUpotrebe;

	public Hrana(String opisProizvoda, int barKod, String zemljaProizvodnje, int godinaPrizvodnje, double uvoznaCijena,
			int brojKalorija, LocalDate datumRokaUpotrebe) {
		super(opisProizvoda, barKod, zemljaProizvodnje, godinaPrizvodnje, uvoznaCijena);
		this.setBrojKalorija(brojKalorija);
		this.setDatumRokaUpotrebe(datumRokaUpotrebe);
	}

	public void setBrojKalorija(int brojKalorija) {
		if(brojKalorija>0) {
			this.brojKalorija = brojKalorija;
		}
		
	}

	public LocalDate getDatumRokaUpotrebe() {
		return datumRokaUpotrebe;
	}

	public void setDatumRokaUpotrebe(LocalDate datumRokaUpotrebe) {
		this.datumRokaUpotrebe = datumRokaUpotrebe;
	}

	
	

		
		public void izracunajCijenu() {
			if(datumRokaUpotrebe.isBefore(LocalDate.now().plusMonths(6))) {
				this.setUvoznaCijena(getUvoznaCijena()*1.05);
			}else {
				this.setUvoznaCijena(getUvoznaCijena()*1.1);
			}
		}

		@Override
		public String toString() {
			return "Hrana [brojKalorija=" + brojKalorija + ", datumRokaUpotrebe=" + datumRokaUpotrebe
					+ ", opisProizvoda=" + opisProizvoda + ", barKod=" + barKod + ", zemljaProizvodnje="
					+ zemljaProizvodnje + ", godinaPrizvodnje=" + godinaPrizvodnje + ", uvoznaCijena=" + uvoznaCijena
					+ ", getDatumRokaUpotrebe()=" + getDatumRokaUpotrebe() + "]";
		}


}
