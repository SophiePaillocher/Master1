public class CommandeEncodeAlgo1 extends ChaineResponsabilite{
	
	private char car;
	private int i;
	
	CommandeEncodeAlgo1(Encodeur encodeur, ChaineResponsabilite chaine, char car, int i){
		super(encodeur, chaine);
		this.car = car;
		this.i = i;
	}
	
	public CommandeEncodeAlgo1(Encodeur encodeur, char car, int i){
		super(encodeur);
		this.car = car;
		this.i = i;
	}
	
	public String internalExecute(String str){
		return encodeur.encode1(str, car, i);
	}

}

