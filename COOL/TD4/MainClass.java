public class MainClass {
	public static void main(String[] args) {
		
		Encodeur encodeur = new Encodeur();
		String s = "un exemple de composition";
		MailService ms = new MailService();
		ms.ajouteCommande(new CommandeConversionMajuscule());
		ChaineResponsabilite c1 = new CommandeEncodeAlgo2(encodeur);
		ChaineResponsabilite c2 = new CommandeEncodeAlgo1(encodeur, c1, '&', 3);
		ChaineResponsabilite c3 = new CommandeEncodeAlgo1(encodeur, c2, '=', 4);
		ms.ajouteCommande(c3);
		System.out.println(s + " -> " + ms.prepareMsg(s));
	}
}
