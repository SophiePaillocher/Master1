
public class Citadine extends Voiture{
	private boolean aIPOD;
	
	public Citadine(String immatriculation, double price, boolean aIPOD){
		super(immatriculation, price);
		this.aIPOD = aIPOD;
	}
	
	public boolean getIPOD(){
		return aIPOD;
	}

}
