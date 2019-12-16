
public class Monospace extends Voiture {
	private int places;
	
	public Monospace(String immatriculation, double price, int places){
		super(immatriculation, price);
		this.places = places;
	}
	
	public int getPlaces(){
		return places;
	}
}
