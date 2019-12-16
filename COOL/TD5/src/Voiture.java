
public class Voiture {
	protected int reservoir = 40;
	protected int cylindre = 4;
	private String immatriculation;
	private double prix;
	
	public Voiture(String immatriculation, double prix){
		this.immatriculation = immatriculation;
		this.prix = prix;
	}
	
	public int getReservoir(){
		return reservoir;
	}
	
	public int getCylindre(){
		return cylindre;
	}
	
	public String getImmatriculation(){
		return immatriculation;
	}
	
	public double getPrix(){
		return prix;
	}
}
