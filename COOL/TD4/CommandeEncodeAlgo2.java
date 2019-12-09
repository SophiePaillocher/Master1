public class CommandeEncodeAlgo2 implements Commande{

	private Encodeur encodeur;
	
	public void CommandeEncodeAlgo2(Encodeur encodeur){
		this.encodeur = encodeur;
	}

	public String prepareMsg(String str){
		return encodeur.encode2(str);
	}
}
