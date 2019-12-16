import java.util.ArrayList;
import java.lang.Object;


public class Bilan {
	private ArrayList<Voiture> voitures;
	
	public Bilan(){
		voitures = new ArrayList<Voiture>();
	}
	
	public void addVoiture(Voiture voiture){
		voitures.add(voiture);
	}
	
	public void printBilan(){
		for (Voiture voiture : voitures){
			System.out.print("immatriculation : " + voiture.getImmatriculation());
			System.out.print(" cylindre :" + voiture.getCylindre());
			System.out.print(" reservoir :" + voiture.getReservoir());
			System.out.print(" prix : " + voiture.getPrix());
			if (voiture.getClass() == Berline.class )
				System.out.print(" GPS : " + ((Berline) voiture).getGPS());
			System.out.println("");
		}
	}
}
