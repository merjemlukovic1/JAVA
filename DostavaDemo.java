package zadaci;

public class DostavaDemo {

	public static void main(String[] args) {
		double udaljenostKm =10;
		Vozilo [] vozila = new Vozilo [3];
		
		vozila [0] = new Bicikl (321, 20);
		vozila [1] = new Bicikl (1,20);
		vozila [2] = new Bicikl (1,20);
		
		double ukupnoVrijeme = 10;
		
		for (Vozilo v : vozila) {
			v.info ();
			if (v instanceof Ekonomican) {
				Ekonomican e = (Ekonomican ) v;
				double ukupnapotrosnja = e.potrosnjaPoKm() * udaljenostKm;
				System.out.println("ukupna potrosnja :" +udaljenostKm +"kilometara je :" + ukupnapotrosnja );
			}
		}
	
	
	
	
	
	}
	

}
