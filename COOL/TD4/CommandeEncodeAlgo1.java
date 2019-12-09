public class CommandeEncodeAlgo1 implements Commande{
	private Encodeur encodeur;
	private char c;
	private int i;
	
	public CommandeEncodeAlgo1(Encodeur encodeur, char c, int i){
		this.encodeur = encodeur;
		this.c = c;
		this.i = i;
	}

	public String execute(String str){
		return encodeur.encode1(str, c, i);
	}
}

