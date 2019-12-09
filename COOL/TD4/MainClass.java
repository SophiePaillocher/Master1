public class MainClass {
	public static void main(String[] args) {

		String s = "Un premier message.";
		MailService ms = new MailService();
		ms.ajouteCommande(new CommandeConversionMajuscule());
		ms.ajouteCommande(new CommandeEncodeAlgo1(encodeur, '&', 3));
		System.out.println(s + " -> " + ms.prepareMsg(s));
		String s2 = "Un second message.";
		ms = new MailService();
		ms.ajouteCommande(new CommandeConversionMajuscule());
		ms.ajouteCommande(new CommandeEncodeAlgo2(encodeur));
		System.out.println(s2 + " -> " + ms.prepareMsg(s2));
	}
}
