package zadaci;

public class Motor extends Vozilo implements Ekonomican {

	public Motor(int id, double maxBrzina) {
		super(id,60);
		
	}

	@Override
	public double potrosnjaPoKm() {
		
		return 0;
	}

	@Override
	public double   izracunajVrijemeDostave(double udaljenostKm){
		return udaljenostKm/maxBrzina;
		
	}
	
	
}
