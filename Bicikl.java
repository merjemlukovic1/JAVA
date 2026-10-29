package zadaci;

public  class Bicikl extends Vozilo implements Ekonomican {

	public Bicikl(int id, double maxBrzina) {
		super(id, 20);
		
	}

	@Override
	public double potrosnjaPoKm() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		
		return udaljenostKm/maxBrzina;
		
	}


}
