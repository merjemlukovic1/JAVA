package Zadaci;

public class Kuvar extends Zaposleni {
	protected double plataPoSatu;
	private double iznos;

	

	public Kuvar(int jedinstveniId, String ime, String prezime, int satnica, int ukupanBrojSati, double plata,
			double plataPoSatu, double plataPoSatu2, double iznos) {
		super(jedinstveniId, ime, prezime, satnica, ukupanBrojSati, plata, plataPoSatu);
		plataPoSatu = plataPoSatu2;
		this.iznos = iznos;
	}

	public double getPlataPoSatu() {
		return plataPoSatu;
	}

	public void setPlataPoSatu(double plataPoSatu) {
		this.plataPoSatu = plataPoSatu;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		this.iznos = iznos;
	}
	
	@Override
	public double obracunajPlatu() {
		return iznos + 4*ukupanBrojSati+plataPoSatu;
	}

	@Override
	public String toString() {
		return "Kuvar [plataPoSatu=" + plataPoSatu + ", iznos=" + iznos + ", plata=" + plata + ", satnica=" + satnica
				+ ", ukupanBrojSati=" + ukupanBrojSati + ", getPlataPoSatu()=" + getPlataPoSatu() + ", getIznos()="
				+ getIznos() + ", obracunajPlatu()=" + obracunajPlatu() + "]";
	}
	
	
	
}
