public class MailService{
	private ArrayList<Commande> commandes;

	public void MailService(){
		commandes = new ArrayList<Commande>();
	}

	public void ajouteCommande(Commande commande){
		commandes.add(commande);
	}
}
