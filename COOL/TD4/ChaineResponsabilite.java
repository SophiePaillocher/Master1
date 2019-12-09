public abstract class ChaineResponsabilite implements Commande {
	private ChaineResponsabilite suivant;
	protected Encodeur encodeur;
	
	ChaineResponsabilite(Encodeur encodeur, ChaineResponsabilite suivant){
		this.suivant = suivant;
		this.encodeur=encodeur;
	}
	
	ChaineResponsabilite(Encodeur encodeur){
		this.encodeur = encodeur;
		suivant = null;
	}
	
		
	public String execute(String s){
		String str = internalExecute(s);
		if (suivant!=null)
			return suivant.execute(str);
		else
			return str;
	}
	
	abstract protected String internalExecute(String s);
}
