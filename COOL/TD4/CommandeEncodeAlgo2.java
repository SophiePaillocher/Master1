public class CommandeEncodeAlgo2 extends ChaineResponsabilite{
	
	
	CommandeEncodeAlgo2(Encodeur encodeur) {
		super(encodeur);
	}

	public String internalExecute(String str){
		return encodeur.encode2(str);
	}
}
