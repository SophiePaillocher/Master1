
public class Main {

	public static void main(String[] args) {
		Berline berline1 = new Berline("ab731zv", 5000, false);
		Monospace monospace1 = new Monospace("ot170mn", 36000, 7);
		Citadine citadine1 = new Citadine("cv036cw", 1300, false);
		System.out.println("La berline1 a un reservoir de "+ berline1.getReservoir()+"L et "+ berline1.getCylindre()+ " cylindres. Son numero d immatriculation est le "+ berline1.getImmatriculation()+ "et son prix est de "+ berline1.getPrix()+ "euros.");
		

	}

}
