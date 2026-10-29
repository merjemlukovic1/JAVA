package Zadaci;

public class Zaposleni {
	private int jedinstveniId;
	private String ime;
	private String prezime;
	protected double plata;
	protected int satnica;
	protected int ukupanBrojSati;
	protected double plataPoSatu;

	public Zaposleni(int jedinstveniId, String ime, String prezime, int satnica, int ukupanBrojSati, double plata , double plataPoSatu) {
		super();
		this.jedinstveniId = jedinstveniId;
		this.ime = ime;
		this.prezime = prezime;
		this.satnica = satnica;
		this.ukupanBrojSati = ukupanBrojSati;
		this.plata = plata;

	}

	public int getJedinstveniId() {
		return jedinstveniId;
	}

	public void setJedinstveniId(int jedinstveniId) {
		this.jedinstveniId = jedinstveniId;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getSatnica() {
		return satnica;
	}

	public void setSatnica(int satnica) {
		this.satnica = satnica;
	}

	public int getUkupanBrojSati() {
		return ukupanBrojSati;
	}

	public void setUkupanBrojSati(int ukupanBrojSati) {
		this.ukupanBrojSati = ukupanBrojSati;

	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
		
	}

	public double getPlataPoSatu() {
		return plataPoSatu;
	}

	public void setPlataPoSatu(double plataPoSatu) {
		this.plataPoSatu = plataPoSatu;
	}

	public double obracunajPlatu() {
		return ukupanBrojSati * satnica;
	}

	@Override
	public String toString() {
		return "Zaposleni [jedinstveniId=" + jedinstveniId + ", ime=" + ime + ", prezime=" + prezime + ", satnica="
				+ satnica + ", ukupanBrojSati=" + ukupanBrojSati + ", getJedinstveniId()=" + getJedinstveniId()
				+ ", getIme()=" + getIme() + ", getPrezime()=" + getPrezime() + ", getSatnica()=" + getSatnica()
				+ ", getUkupanBrojSati()=" + getUkupanBrojSati() + "]";
	}


}
