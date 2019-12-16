
public class Main {

	public static void main(String[] args) {
		Berline berline1 = new Berline("ab731zv", 5000, false);
		Monospace monospace1 = new Monospace("ot170mn", 36000, 7);
		Citadine citadine1 = new Citadine("cv036cw", 1300, false);
		Bilan bilan = new Bilan();
		bilan.addVoiture(berline1);
		bilan.addVoiture(citadine1);
		bilan.addVoiture(monospace1);
		bilan.printBilan();

	}

}
