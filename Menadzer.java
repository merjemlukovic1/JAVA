package Zadaci;

public class Menadzer extends Zaposleni {
	private double osnovica = 1300.0;
	private double bonus;

	public Menadzer(int jedinstveniId, String ime, String prezime, int satnica, int ukupanBrojSati, double plata,
			double plataPoSatu, double osnovica, double bonus) {
		super(jedinstveniId, ime, prezime, satnica, ukupanBrojSati, plata, plataPoSatu);
		this.osnovica = osnovica;
		this.bonus = bonus;
	}
	public double getOsnovica() {
		return osnovica;
	}
	public void setOsnovica(double osnovica) {
		this.osnovica = osnovica;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double obracunajPlatu() {
		return osnovica+4*ukupanBrojSati*plataPoSatu+bonus;
	}

}
