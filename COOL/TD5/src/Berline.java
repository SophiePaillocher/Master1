
public class Berline extends Voiture{
	private boolean aGPS;
	
	public Berline(String immatriculation, double price, boolean aGPS){
		super(immatriculation, price);
		this.aGPS = aGPS;
	}
	
	public boolean getGPS(){
		return aGPS;
	}
}
