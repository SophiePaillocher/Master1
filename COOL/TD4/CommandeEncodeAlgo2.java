public class CommandeEncodeAlgo2 implements Commande{

	private Encodeur encodeur;
	
	public CommandeEncodeAlgo2(Encodeur encodeur){
		this.encodeur = encodeur;
	}

	public String execute(String str){
		return encodeur.encode2(str);
	}
}
