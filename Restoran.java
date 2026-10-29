package Zadaci;
import java.util.ArrayList;
public class Restoran {
	protected String naziv;
	protected String adresa;
	protected int PIB;
	private ArrayList<Zaposleni>listaZaposlenih = new ArrayList<Zaposleni>();
	
	public Restoran(String naziv, String adresa, int pIB, ArrayList<Zaposleni> listaZaposlenih) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		PIB = pIB;
		this.listaZaposlenih = listaZaposlenih;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getPIB() {
		return PIB;
	}

	public void setPIB(int pIB) {
		PIB = pIB;
	}

	public ArrayList<Zaposleni> getListaZaposlenih() {
		return listaZaposlenih;
	}

	public void setListaZaposlenih(ArrayList<Zaposleni> listaZaposlenih) {
		this.listaZaposlenih = listaZaposlenih;
	}
	
	public void dodajZaposlenog(Zaposleni z) {
		listaZaposlenih.add(z);
	}
	
	public void ukloni(Zaposleni z) {

			listaZaposlenih.remove(z.getJedinstveniId());	
			}

	public void nadjiZaposlenog (int id) {
		for (Zaposleni z : listaZaposlenih) {
			if(z.getJedinstveniId()==id) {
				System.out.println(z.getIme());
			}
			
		}
	}
}
