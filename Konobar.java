package Zadaci;

public class Konobar extends Zaposleni {
	private int prekovremeniRad;



	public Konobar(int jedinstveniId, String ime, String prezime, int satnica, int ukupanBrojSati, double plata,
			double plataPoSatu, int prekovremeniRad) {
		super(jedinstveniId, ime, prezime, satnica, ukupanBrojSati, plata, plataPoSatu);
		this.prekovremeniRad = prekovremeniRad;
	}

	public int getPrekovremeniRad() {
		return prekovremeniRad;
	}

	public void setPrekovremeniRad(int prekovremeniRad) {
		this.prekovremeniRad = prekovremeniRad;
	}
	
	@Override
	public double obracunajPlatu() {
		return ukupanBrojSati* satnica+plata*ukupanBrojSati*1.2;
	}

	@Override
	public String toString() {
		return "Konobar [prekovremeniRad=" + prekovremeniRad + ", plata=" + plata + ", satnica=" + satnica
				+ ", ukupanBrojSati=" + ukupanBrojSati + ", getPrekovremeniRad()=" + getPrekovremeniRad()
				+ ", obracunajPlatu()=" + obracunajPlatu() + "]";
	}
	
}
