import java.util.ArrayList;

public class MailService{
	private ArrayList<Commande> commandes;

	public MailService(){
		this.commandes = new ArrayList<Commande>();
	}

	public void ajouteCommande(Commande commande){
		commandes.add(commande);
	}
	
	public String prepareMsg(String str){
		String s = str;
		for (Commande commande : commandes)
			s = commande.execute(s);
		return s;
	}
}
